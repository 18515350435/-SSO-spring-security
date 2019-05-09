package com.zc.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.regex.Pattern;

public class SystemUtils {

    public static final Logger LOGGER = LoggerFactory.getLogger(SystemUtils.class);

    public static String getLocalIp() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            LOGGER.error("获取本机IP出错", e);
            return "";
        }
    }

    public static String getLocalSystemIp() throws SocketException {
        Pattern pattern = Pattern.compile("/(\\d+[\\.]){3}\\d+");
        Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
        String ip = "";
        String addr = "";
        while (enumeration.hasMoreElements()) {
            NetworkInterface networkInterface = enumeration.nextElement();
            if (networkInterface.isUp()) {
                Enumeration<InetAddress> addressEnumeration = networkInterface.getInetAddresses();
                while (addressEnumeration.hasMoreElements()) {
                    addr = addressEnumeration.nextElement().toString();
                    if (pattern.matcher(addr).matches()) {
                        ip += addr;
                    }
                }
            }
        }
//        LoggerFactory.getLogger(SystemUtils.class).info("GET SYSTEM IP ADDR => " + ip);
        return ip;
    }

    public static String longToIp(long ipLong) {
        StringBuilder sb = new StringBuilder();
        sb.append(ipLong >>> 24);
        sb.append(".");
        sb.append(String.valueOf((ipLong & 0x00FFFFFF) >>> 16));
        sb.append(".");
        sb.append(String.valueOf((ipLong & 0x0000FFFF) >>> 8));
        sb.append(".");
        sb.append(String.valueOf(ipLong & 0x000000FF));
        return sb.toString();
    }

    public static long ipToLong(String ipString) {
        long result = 0;
        try {
            java.util.StringTokenizer token = new java.util.StringTokenizer(ipString, ".");
            result += Long.parseLong(token.nextToken()) << 24;
            result += Long.parseLong(token.nextToken()) << 16;
            result += Long.parseLong(token.nextToken()) << 8;
            result += Long.parseLong(token.nextToken());
        } catch (Exception e) {

        }
        return result;
    }
}
