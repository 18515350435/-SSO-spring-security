package com.zc.common.util;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * ClassName: ConfigUtil
 * </p>
 * <p>
 * Description: 配置文件
 * </p>
 * <p>
 * Author: hyson
 * </p>
 * <p>
 * Date: 2014-09-29
 * </p>
 */
public class ConfigUtil {

	private static final Logger logger = LoggerFactory.getLogger(ConfigUtil.class);

	// application.properties属性文件加载
	private static Properties properties = new Properties();
	// 加载 公钥证书
	private static PublicKey publicKey = null;

	/**
	 * 获得值
	 * 
	 * @param key
	 *            键
	 * @return 值
	 */
	private static String getConfig(String key) {
		if (properties.size() == 0) {
			InputStream fis = null;
			try {
				fis = ConfigUtil.class.getResourceAsStream("/application.yml");
				properties.load(fis);
			} catch (FileNotFoundException e) {
				logger.error("Exception is {}", e);
			} catch (IOException e) {
				logger.error("Exception is {}", e);
			} finally {
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						logger.error("Exception is {}", e);
					}
				}
			}
		}
		return properties.getProperty(key);
	}
	
	/**
	 * 获取公钥证书
	 * @author jzc 2017年7月5日
	 * @return
	 * @throws CertificateException
	 * @throws FileNotFoundException
	 */
	public static PublicKey getPublicKey() throws CertificateException, FileNotFoundException {
		if (publicKey == null) {
			String certName = getConfig("publickey.cert.name");
			InputStream fis = ConfigUtil.class.getResourceAsStream("/" + certName);
			try {
				CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509");
				X509Certificate cert = (X509Certificate) certificatefactory.generateCertificate(fis);
				publicKey = cert.getPublicKey();
				return publicKey;
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					logger.error("Exception is {}", e);
				}
			}
		}
		return publicKey;
	}

}