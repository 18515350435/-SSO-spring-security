package com.zc.common.util;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class EncryptUtil {

  /**
   * AES 加密
   * @param str 需要加密的字符串
   * @param key 公钥
   * @return 加密后的字符串
   */
  public static String aesEncrypt(String text, String key) {
    if (text == null || key == null) {
        return null;
    }
    try {
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"));
      byte[] bytes = cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
      return new String(bytes, StandardCharsets.UTF_8);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      e.printStackTrace();
    } catch (BadPaddingException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * AES 解密
   * 
   * @param text
   *          加密串
   * @param key
   *          公钥
   * @return 解密后字符串
   */
  public static String aesDecrypt(byte[] text, byte[] key) {
    if (text == null || key == null) {
        return null;
    }
    try {
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"));
      byte[] bytes = cipher.doFinal(text);
      return new String(bytes, StandardCharsets.UTF_8);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      e.printStackTrace();
    } catch (BadPaddingException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * AES 解密
   * 
   * @param text
   *          加密串
   * @param key
   *          公钥
   * @return 解密后字符串
   */
  public static String aesDecrypt(String text, String key) {
    if (text == null || key == null) {
        return null;
    }

    return aesDecrypt(text.getBytes(StandardCharsets.UTF_8), key.getBytes(StandardCharsets.UTF_8));
  }

  /**
   * AES 解密
   * 
   * @param text
   *          加密串
   * @param key
   *          公钥
   * @return 解密后字符串
   */
  public static String aesDecrypt(byte[] text, String key) {
    if (text == null || key == null) {
        return null;
    }

    return aesDecrypt(text, key.getBytes(StandardCharsets.UTF_8));
  }

  /**
   * AES 解密
   * 
   * @param text
   *          加密串
   * @param key
   *          公钥
   * @return 解密后字符串
   */
  public static String aesDecrypt(String text, byte[] key) {
    if (text == null || key == null) {
        return null;
    }

    return aesDecrypt(text.getBytes(StandardCharsets.UTF_8), key);
  }
}
