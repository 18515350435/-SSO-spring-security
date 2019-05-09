package com.zc.web.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLContext;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.TextUtils;
import org.apache.poi.util.IOUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @Description HTTP接口请求工具
 * @Author       Peihan.Zhang
 * @CreateTime  2018/5/10
 * @Version     0.0.1
 */
public class HttpClientProxy {
    private static final Logger log = LoggerFactory.getLogger(HttpClientProxy.class);
    private static final int TIMEOUT = 30000;

    public HttpClientProxy() {
    }
    public static String GetRequest(String url) {
        String str = "";
        CloseableHttpClient e = HttpClients.createDefault();
        try {
            try {
                HttpPost httpPost = new HttpPost(url);
                CloseableHttpResponse response1 = e.execute(httpPost);
                HttpEntity entity1 = response1.getEntity();
                InputStream doc;
                if(entity1 != null) {
                    doc = entity1.getContent();
                    str = convertStreamToString(doc);
                    System.out.println(str);
                    return str;
                }
            } catch (IOException var27) {
                log.error("[GT]: get http content error: " + url, var27);
            }
            return null;
        } finally {
            try {
                e.close();
            } catch (IOException var25) {
                log.error("[GT]: release connection error!", var25);
            }

        }
    }
    //
    /**
     * @Description 设置详细请求头信息请求HTML信息
     * @Author       Peihan.Zhang
     * @CreateTime  2018/8/2
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     * @param       targetUrl 地址
     */
    public static String getHtmlStringBySetHeadDetail(String targetUrl) {
        String content = null;

        HttpURLConnection connection = null;
        try {
            URL url = new URL(targetUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)");
            connection.setRequestProperty("Accept", "image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/x-shockwave-flash, application/vnd.ms-powerpoint, application/vnd.ms-excel, application/msword, */*");
            connection.setRequestProperty("Accept-Language", "zh-cn");
            connection.setRequestProperty("UA-CPU", "x86");
            //为什么没有deflate呢
            connection.setRequestProperty("Accept-Encoding", "gzip");
            connection.setRequestProperty("Content-type", "text/html");
            //keep-Alive，有什么用呢，你不是在访问网站，你是在采集。嘿嘿。减轻别人的压力，也是减轻自己。
            connection.setRequestProperty("Connection", "close");
            //不要用cache，用了也没有什么用，因为我们不会经常对一个链接频繁访问。（针对程序）
            connection.setUseCaches(false);
            connection.setConnectTimeout(6 * 1000);
            connection.setReadTimeout(6 * 1000);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("Charset", "utf-8");

            connection.connect();

            if (200 == connection.getResponseCode()) {
                InputStream inputStream = null;
                if (!TextUtils.isEmpty(connection.getContentEncoding())) {
                    String encode = connection.getContentEncoding().toLowerCase();
                    if (!TextUtils.isEmpty(encode) && encode.indexOf("gzip") >= 0) {
                        inputStream = new GZIPInputStream(connection.getInputStream());
                    }
                }

                if (null == inputStream) {
                    inputStream = connection.getInputStream();
                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                StringBuilder builder = new StringBuilder();
                String line = null;
                while ((line = reader.readLine()) != null) {
                    builder.append(line).append("\n");
                }
                content = builder.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return content;
    }
    public static String PostRequest(String url, Map<String, String> parameters) {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        try {
            try {
                HttpPost e = new HttpPost(url);
                RequestConfig config = RequestConfig.custom().setConnectTimeout(30000).build();
                e.setConfig(config);
                ArrayList nvps = new ArrayList();
                Iterator response = parameters.entrySet().iterator();

                while(response.hasNext()) {
                    Entry statusCode = (Entry)response.next();
                    nvps.add(new BasicNameValuePair((String)statusCode.getKey(), (String)statusCode.getValue()));
                }

                e.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
                CloseableHttpResponse response1 = httpclient.execute(e);

                try {
                    int statusCode1 = response1.getStatusLine().getStatusCode();
                    if(statusCode1 >= 200 && statusCode1 < 300) {
                        HttpEntity entity = response1.getEntity();
                        if(entity != null) {
                            String var9 = EntityUtils.toString(entity);
                            return var9;
                        }

                        log.error("[GT]: get http content error: " + url + "， " + response1);
                        return null;
                    }

                    log.error("[GT]: get http content error: " + url + "， " + response1);
                } finally {
                    response1.close();
                }
            } catch (IOException var27) {
                log.error("[GT]: get http content error: " + url, var27);
            }

            return null;
        } finally {
            try {
                httpclient.close();
            } catch (IOException var25) {
                log.error("[GT]: release connection error!", var25);
            }

        }
    }
    public static String PostRequest(String url, Map<String,String> header,Map<String, String> parameters) {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        try {
            try {
                HttpGet e = new HttpGet(url);
                RequestConfig config = RequestConfig.custom().setConnectTimeout(30000).build();
                if (header!=null&&header.size()>0){
                    Iterator<String> it = header.keySet().iterator();
                    while (it.hasNext()) {
                        String key = it.next();
                        String value = header.get(key);
                        e.setHeader(key,value);
                    }
                }
                e.setConfig(config);
                ArrayList nvps = new ArrayList();
                Iterator response = parameters.entrySet().iterator();

                while(response.hasNext()) {
                    Entry statusCode = (Entry)response.next();
                    nvps.add(new BasicNameValuePair((String)statusCode.getKey(), (String)statusCode.getValue()));
                }
                CloseableHttpResponse response1 = httpclient.execute(e);

                try {
                    int statusCode1 = response1.getStatusLine().getStatusCode();
                    if(statusCode1 >= 200 && statusCode1 < 300) {
                        HttpEntity entity = response1.getEntity();
                        if(entity != null) {
                            String var9 = EntityUtils.toString(entity);
                            return var9;
                        }

                        log.error("[GT]: get http content error: " + url + "， " + response1);
                        return null;
                    }

                    log.error("[GT]: get http content error: " + url + "， " + response1);
                } finally {
                    response1.close();
                }
            } catch (IOException var27) {
                log.error("[GT]: get http content error: " + url, var27);
            }

            return null;
        } finally {
            try {
                httpclient.close();
            } catch (IOException var25) {
                log.error("[GT]: release connection error!", var25);
            }

        }
    }
    public static byte[] PostRequestBytes(String url, Map<String, String> parameters) {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        byte[] var10;
        try {
            HttpPost e = new HttpPost(url);
            RequestConfig config = RequestConfig.custom().setConnectTimeout(30000).build();
            e.setConfig(config);
            ArrayList nvps = new ArrayList();
            Iterator response = parameters.entrySet().iterator();

            while(response.hasNext()) {
                Entry statusCode = (Entry)response.next();
                nvps.add(new BasicNameValuePair((String)statusCode.getKey(), (String)statusCode.getValue()));
            }

            e.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
            CloseableHttpResponse response1 = httpclient.execute(e);

            try {
                int statusCode1 = response1.getStatusLine().getStatusCode();
                if(statusCode1 < 200 || statusCode1 >= 300) {
                    return null;
                }

                HttpEntity entity = response1.getEntity();
                if(entity == null) {
                    return null;
                }

                InputStream instream = entity.getContent();
                if(instream == null) {
                    var10 = null;
                    return var10;
                }

                var10 = IOUtils.toByteArray(instream);
            } finally {
                response1.close();
            }
        } catch (IOException var29) {
            log.error("[GT]: get http content error: " + url, var29);
            return null;
        } finally {
            try {
                httpclient.close();
            } catch (IOException var27) {
                log.error("[GT]: release connection error!", var27);
            }

        }

        return var10;
    }

    public static boolean SendPostRequest(String url, Map<String, String> parameters) {
        String str = "";

        try {
            CloseableHttpClient e = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            ArrayList nvps = new ArrayList();
            Iterator response = parameters.entrySet().iterator();

            while(response.hasNext()) {
                Entry entity = (Entry)response.next();
                nvps.add(new BasicNameValuePair((String)entity.getKey(), (String)entity.getValue()));
            }

            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
            CloseableHttpResponse response1 = e.execute(httpPost);
            HttpEntity entity1 = response1.getEntity();
            InputStream doc;
            if(entity1 != null) {
                doc = entity1.getContent();
                str = convertStreamToString(doc);
                System.out.println(str);
            }

            doc = null;
            Document doc1 = DocumentHelper.parseText(str);
            if(doc1 == null) {
                return false;
            } else {
                Element rootElt = doc1.getRootElement();
                if(rootElt == null) {
                    return false;
                } else {
                    System.out.println("根节点：" + rootElt.getName());
                    System.out.println("根节点的值：" + rootElt.getText());
                    return rootElt.getText() != null && !"".equals(rootElt.getText())?Long.parseLong(rootElt.getText()) > 0L:false;
                }
            }
        } catch (DocumentException var10) {
            var10.printStackTrace();
            return false;
        } catch (Exception var11) {
            var11.printStackTrace();
            return false;
        }
    }

    public static String convertStreamToString(InputStream is) throws UnsupportedEncodingException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is,"utf-8"));
        StringBuilder sb = new StringBuilder();
        String line = null;

        try {
            while((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException var13) {
            var13.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException var12) {
                var12.printStackTrace();
            }

        }

        return sb.toString();
    }

    public static byte[] PostRequestBytes(String url, Map<String, String> parameters, String type) {
        CloseableHttpClient httpclient = null;
        if("https".equals(type)) {
            httpclient = createSSLClientDefault();
        } else {
            httpclient = HttpClients.createDefault();
        }

        try {
            try {
                HttpPost e = new HttpPost(url);
                RequestConfig ex = RequestConfig.custom().setConnectTimeout(30000).build();
                e.setConfig(ex);
                ArrayList nvps = new ArrayList();
                Iterator response = parameters.entrySet().iterator();

                while(response.hasNext()) {
                    Entry statusCode = (Entry)response.next();
                    nvps.add(new BasicNameValuePair((String)statusCode.getKey(), (String)statusCode.getValue()));
                }

                e.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
                CloseableHttpResponse response1 = httpclient.execute(e);

                try {
                    int statusCode1 = response1.getStatusLine().getStatusCode();
                    if(statusCode1 >= 200 && statusCode1 < 300) {
                        HttpEntity entity = response1.getEntity();
                        if(entity != null) {
                            InputStream instream = entity.getContent();
                            byte[] arrayOfByte;
                            if(instream == null) {
                                response1.close();

                                try {
                                    httpclient.close();
                                } catch (IOException var38) {
                                    log.error("[GT]: release connection error!", var38);
                                }

                                arrayOfByte = null;
                                return arrayOfByte;
                            }

                            arrayOfByte = IOUtils.toByteArray(instream);
                            response1.close();

                            try {
                                httpclient.close();
                            } catch (IOException var37) {
                                log.error("[GT]: release connection error!", var37);
                            }

                            byte[] e1 = arrayOfByte;
                            return e1;
                        }
                    }
                } finally {
                    response1.close();
                }

                response1.close();
            } catch (IOException var40) {
                log.error("[GT]: get http content error: " + url, var40);

                try {
                    httpclient.close();
                } catch (IOException var36) {
                    log.error("[GT]: release connection error!", var36);
                }

                return null;
            }

            return null;
        } finally {
            try {
                httpclient.close();
            } catch (IOException var35) {
                log.error("[GT]: release connection error!", var35);
            }

        }
    }

    public static String PostRequest(String url, Map<String, String> parameters, String type) {
        CloseableHttpClient httpclient = null;
        if("https".equals(type)) {
            httpclient = createSSLClientDefault();
        } else {
            httpclient = HttpClients.createDefault();
        }

        try {
            try {
                HttpPost e = new HttpPost(url);
                RequestConfig ex = RequestConfig.custom().setConnectTimeout(30000).build();
                e.setConfig(ex);
                ArrayList nvps = new ArrayList();
                Iterator response = parameters.entrySet().iterator();

                while(response.hasNext()) {
                    Entry statusCode = (Entry)response.next();
                    nvps.add(new BasicNameValuePair((String)statusCode.getKey(), (String)statusCode.getValue()));
                }

                e.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
                CloseableHttpResponse response1 = httpclient.execute(e);

                try {
                    int statusCode1 = response1.getStatusLine().getStatusCode();
                    if(statusCode1 >= 200 && statusCode1 < 300) {
                        HttpEntity entity = response1.getEntity();
                        if(entity != null) {
                            String str = EntityUtils.toString(entity);
                            response1.close();

                            try {
                                httpclient.close();
                            } catch (IOException var33) {
                                log.error("[GT]: release connection error!", var33);
                            }

                            String e1 = str;
                            return e1;
                        }

                        log.error("[GT]: get http content error: " + url + "，" + response1);
                    } else {
                        log.error("[GT]: get http content error: " + url + "，" + response1);
                    }
                } finally {
                    response1.close();
                }

                response1.close();
            } catch (IOException var35) {
                log.error("[GT]: get http content error: " + url, var35);

                try {
                    httpclient.close();
                } catch (IOException var32) {
                    log.error("[GT]: release connection error!", var32);
                }

                return null;
            }

            return null;
        } finally {
            try {
                httpclient.close();
            } catch (IOException var31) {
                log.error("[GT]: release connection error!", var31);
            }

        }
    }

    public static CloseableHttpClient createSSLClientDefault() {
        try {
            SSLContext e = (new SSLContextBuilder()).loadTrustMaterial((KeyStore)null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(e);
            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyManagementException var2) {
            var2.printStackTrace();
        } catch (NoSuchAlgorithmException var3) {
            var3.printStackTrace();
        } catch (KeyStoreException var4) {
            var4.printStackTrace();
        }

        return HttpClients.createDefault();
    }

    public static void main(String[] args) {
        String url = "http://yes.itissm.com/api/MsgSend.asmx/SendMsg";
        HashMap map = new HashMap();
        map.put("userCode", "CPYX");
        map.put("userPass", "CPYX792");
        map.put("Channel", "78");
        map.put("DesNo", "18201527,18801215335,18310497033,18610684323,18516211141");
        map.put("Msg", "《荷塘月色》是中国文学家朱自清任教清华大学时所写的一篇散文，因收入中学语文教材而广为人知，是现代抒情散文的名篇。文章写了荷塘月色美丽的景象，含蓄而又委婉地抒发了作者不满现实，渴望自由，想超脱现实而又不能的复杂的思想感情，为后人留下了旧中国正直知识分子在苦难中徘徊前进的足迹。寄托了作者一种向往于未来的政治思想，也寄托了作者对荷塘月色的喜爱之情。【世界高铁网】");
        System.out.println(SendPostRequest(url, map));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
    }
}