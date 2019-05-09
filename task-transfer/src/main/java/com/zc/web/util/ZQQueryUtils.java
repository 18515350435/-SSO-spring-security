package com.zc.web.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 真空网查询工具
 * @Author       Peihan.Zhang
 * @CreateTime  2018/5/8
 * @Version     0.0.1
 */
public class ZQQueryUtils {
    private static Logger logger = LoggerFactory.getLogger(ZQQueryUtils.class);
    private static final String UTF_8 = "UTF-8";
    private static String URL="https://www.izhenqi.cn/api/zhenqinewapi.php";
    private static String APPID="268acb07f597ee789f66331312ab6e38";
    /**
     * 真空网POST接口请求
     */
    public static JSONObject ZQPostQuery(String method){
        return  ZQPostQuery(method,"");
    }
    /**
     * 真空网POST接口请求
     */
    public static JSONObject ZQPostQuery(String method,String type){
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("appId",APPID);
            jsonObject.put("method",method);
            if(type!=null&&!type.equals("")){
                jsonObject.put("type",type);
            }
            if(type==null) {type="";}
            String secret=DigestUtils.md5Hex(APPID+method+type);
            jsonObject.put("secret",secret);
            Map<String, String> postData = new HashMap<String, String>();
            postData.put("param", base64encodeData(jsonObject.toJSONString()));
            String responseMsg = HttpClientProxy.PostRequest(URL, postData);
            byte[] src = new Base64().decode(responseMsg);
            byte[] buf = Des.decrypt(src, secret);
            String rs = base64decodeData(new String(buf));
            JSONObject jsonObjectrs = jsonStrToJson(rs);
            if(jsonObjectrs.getString("success").equals("false")){
                logger.error("定时任务获取数据失败. errorcode:" + jsonObjectrs.getString("errorcode")+" errormsg:"+jsonObjectrs.getString("errormsg"));
                throw new Exception();
            }
            return  jsonObjectrs;
        } catch (Exception e) {
            logger.error("定时任务执行异常." + e.getMessage()+" method:"+method+" type:"+type, e);
            throw new TaskException();
        }
    }
    /**
     * json字符串转成 json对象
     */
    public static JSONObject jsonStrToJson(String jsonStr){
        JSONObject jsonObject = JSONObject.parseObject(jsonStr); //将字符串{“id”：1}
        return  jsonObject;
    }
    /**
     * json对象转换成java对象
     */
    public static <T> T jsonStrToJson(JSONObject jsonObject,Class<T> tClass){
        T stud = JSONObject.toJavaObject(jsonObject,tClass);
        return  stud;
    }
    /**
     * 对给定的字符串进行base64解码操作
     */
    public static String base64decodeData(String inputData) {
        try {
            if (null == inputData) {
                return null;
            }
            return new String(Base64.decodeBase64(inputData.getBytes(UTF_8)), UTF_8);
        } catch (UnsupportedEncodingException e) {
            logger.error(inputData, e);
        }

        return null;
    }

    /**
     * 对给定的字符串进行base64加密操作
     */
    public static String base64encodeData(String inputData) {
        try {
            if (null == inputData) {
                return null;
            }
            return new String(Base64.encodeBase64(inputData.getBytes(UTF_8)), UTF_8);
        } catch (UnsupportedEncodingException e) {
            logger.error(inputData, e);
        }

        return null;
    }
    public static void main(String[] args) throws Exception {
    	System.out.println(DigestUtils.md5Hex("123456"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appId",APPID);
        jsonObject.put("method","dfreg");
        jsonObject.put("secret","dfgdsfsdfsdf");
        System.out.println(jsonObject.toJSONString());
        JSONObject jsonObject1 = ZQPostQuery("ZCNAPI_GETLFDATA");
        System.out.println(jsonObject1.toJSONString());
    }
}
