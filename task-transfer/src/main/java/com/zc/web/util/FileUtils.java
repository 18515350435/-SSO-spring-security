package com.zc.web.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.UUID;

@Component
@ConfigurationProperties(prefix="myfileserver") //接收application.yml中的myProps下面的属性
public class FileUtils {
    /** 文件上传保存的本地路径路径 */
//    public static String localPath="E:/Hb/GuAn/Image/";
    private String localPath;

    /** 文件文件访问路径*/
//    public static String url="http://117.119.97.150:8062/";
    private String url;

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 将文件保存到指定目录
     * @param filePath 文件将要保存的目录
     * @param inputStream 文件流
     */

    public static File saveFileToPath(InputStream inputStream,String filePath){
        //System.out.println("fileName---->"+filePath);
        //创建不同的文件夹目录
        File file=new File(filePath);
        //判断文件夹是否存在
        if (!file.exists())
        {
            //如果文件夹不存在，则创建新的的文件夹
            file.mkdirs();
        }
        FileOutputStream fileOut = null;
        try
        {
            // 建立链接
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            //判断文件的保存路径后面是否以/结尾
            if (!filePath.endsWith("/")) {

                filePath += "/";

            }
            //写入到文件（注意文件保存路径的后面一定要加上文件的名称）
            fileOut = new FileOutputStream(filePath+"123.png");
            BufferedOutputStream bos = new BufferedOutputStream(fileOut);

            byte[] buf = new byte[4096];
            int length = bis.read(buf);
            //保存文件
            while(length != -1)
            {
                bos.write(buf, 0, length);
                length = bis.read(buf);
            }
            bos.close();
            bis.close();
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("抛出异常！！");
        }

        return file;

    }
    /**
     * @Description  将文件保存到实现配置好的位置并返回访问路径
     * @Author       Peihan.Zhang
     * @CreateTime  2018/8/24
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     * @param   inputStream 文件流
     * @param   fileName 文件名
     * @return 文件访问路径
     */
    public String saveWebFile(InputStream inputStream,String fileName){
        fileName = UUID.randomUUID().toString()+"_"+fileName;
        String filePath=this.localPath;
        //创建不同的文件夹目录
        File file=new File(filePath);
        //判断文件夹是否存在
        if (!file.exists())
        {
            //如果文件夹不存在，则创建新的的文件夹
            file.mkdirs();
        }
        FileOutputStream fileOut = null;
        try
        {
            // 建立链接
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            //判断文件的保存路径后面是否以/结尾
            if (!filePath.endsWith("/")) {

                filePath += "/";

            }
            //写入到文件（注意文件保存路径的后面一定要加上文件的名称）
            fileOut = new FileOutputStream(filePath+fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fileOut);

            byte[] buf = new byte[4096];
            int length = bis.read(buf);
            //保存文件
            while(length != -1)
            {
                bos.write(buf, 0, length);
                length = bis.read(buf);
            }
            bos.close();
            bis.close();
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("抛出异常！！");
        }
        return this.url+fileName;
    }

}