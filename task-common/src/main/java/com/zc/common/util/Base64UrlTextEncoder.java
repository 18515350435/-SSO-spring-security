package com.zc.common.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

public class Base64UrlTextEncoder {
  public static String encode(byte[] data) {
    String result = "";
    String encodeString = Base64.encodeBase64String(data);
    result = encodeString.substring(0, encodeString.indexOf('='));
    result = result.replaceAll("+", "-");
    result = result.replaceAll("/", "_");
    return result;
  }

  public static byte[] decode(String text) {
    String decodeString = text.replaceAll("-", "+");
    decodeString = decodeString.replaceAll("_", "/");
    decodeString = rightPad(decodeString);

    return Base64.decodeBase64(decodeString);
  }

  private static String rightPad(String text) {
    int padding = 3 - ((text.length() + 3) % 4);
    if (padding == 0) {
      return text;
    }
    return text + StringUtils.rightPad("", padding, "=");
  }

}
