package com.zc.common.util;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.BitSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class UrlEncoderUtils {
  
  private static final Logger logger = LoggerFactory.getLogger(UrlEncoderUtils.class);
  
  private static BitSet       dontNeedEncoding;
  
  /**
   * 不会被编码的内容: 1.大写字母A-Z 2.小写字母a-z 3.数字 0-9 4.标点符 - _ . ! ( ) *
   */
  static {
    dontNeedEncoding = new BitSet(256);
    int i;
    for (i = 'a'; i <= 'z'; i++) {
      dontNeedEncoding.set(i);
    }
    for (i = 'A'; i <= 'Z'; i++) {
      dontNeedEncoding.set(i);
    }
    for (i = '0'; i <= '9'; i++) {
      dontNeedEncoding.set(i);
    }
    dontNeedEncoding.set('-');
    dontNeedEncoding.set('_');
    dontNeedEncoding.set('.');
    dontNeedEncoding.set('!');
    dontNeedEncoding.set('*');
    dontNeedEncoding.set('(');
    dontNeedEncoding.set(')');
  }
  
  public static boolean isUrlEncoded(String str) {
    
    boolean needEncode = false;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (dontNeedEncoding.get((int) c)) {
        continue;
      }
      if (c == '%' && (i + 2) < str.length()) {
        char c1 = str.charAt(++i);
        char c2 = str.charAt(++i);
        if (isDigit16Char(c1) && isDigit16Char(c2)) {
          continue;
        }
      }
      needEncode = true;
      break;
    }
    
    return !needEncode;
  }
  
  public static String encode(String urlString) {
    try {
      boolean isUrlEncoded = isUrlEncoded(urlString);
      
      String urlEncode = (isUrlEncoded) ? urlString : URLEncoder.encode(urlString, "utf-8");
      return urlEncode;
    } catch (Exception ex) {
      logger.error(ex.getMessage());
    }
    return null;
  }
  
  public static String decode(String urlString) {
    try {
      boolean isUrlEncoded = isUrlEncoded(urlString);
      
      String urlDecode = (isUrlEncoded) ? URLDecoder.decode(urlString, "utf-8") : urlString;
      return urlDecode;
    } catch (Exception ex) {
      logger.error(ex.getMessage());
    }
    return null;
  }
  
  private static boolean isDigit16Char(char c) {
    return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F');
  }
}
