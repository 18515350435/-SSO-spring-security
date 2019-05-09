package com.zc.service.util;

import java.io.FileNotFoundException;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;

import com.zc.api.model.resp.CookieInfoResp;
import com.zc.common.util.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zc.common.util.Base64UrlTextEncoder;
import com.zc.common.util.ConfigUtil;
import com.zc.common.util.EncryptUtil;

//@Component
public class CookieHandlerUtil {
//	@Value("${m.protector.key}")
	private String key;

	private static final Logger logger = LoggerFactory
			.getLogger(CookieHandlerUtil.class);

	public static String decodeCookie(String jwtEncodeString) {

		String result = null;
		String key = "B7RylWwyaUlz8ZA7y4EJF2AWc2KXfxe8";
		CookieInfoResp cookieInfo = decodeCookie(jwtEncodeString, key);

		result = cookieInfo.toString();

		return result;
	}

	public static CookieInfoResp decodeCookie(String jwtEncodeString, String key) {
		CookieInfoResp cookieInfo = new CookieInfoResp();
		if (StringUtils.isNotEmpty(jwtEncodeString)) {
			// base64 解码
			byte[] cookieDecode = Base64UrlTextEncoder.decode(jwtEncodeString);
			// AES 解密
			String result = EncryptUtil.aesDecrypt(cookieDecode, key);
			try {
				// 获取公钥证书
				RSAPublicKey publicKey = (RSAPublicKey) ConfigUtil
						.getPublicKey();
				// 签名校验 并且 获取jwt
				DecodedJWT jwt = JWT.require(Algorithm.RSA256(publicKey, null))
						.build().verify(result);
				// 封装信息
				cookieInfo = getCookieInfo(jwt, jwtEncodeString);
				logger.debug("cookieInfo:" + cookieInfo);
				logger.debug("cookie mso verify is success !");
			} catch (FileNotFoundException e) {
				// e.printStackTrace();
				logger.error(
						"publickey cert file is not found ! exception is {}", e);
			} catch (CertificateException e) {
				// e.printStackTrace();
				logger.error("publickey cert parse faild ! exception is {}", e);
			} catch (Exception e) {
				// e.printStackTrace();
				logger.warn("cookie mso verify is faild ! exception is {}", e);
			}

		}
		return cookieInfo;
	}

	public static CookieInfoResp getCookieInfo(DecodedJWT jwt,
			String jwtEncodeString) {
		CookieInfoResp cookieInfo = new CookieInfoResp();
		if (jwt != null) {
			cookieInfo.setJwt(jwtEncodeString);
			cookieInfo.setAlg(jwt.getAlgorithm());
			cookieInfo.setKid(jwt.getKeyId());
			cookieInfo.setTyp(jwt.getType());
			cookieInfo.setExp(jwt.getClaims().get("exp").asLong());
			cookieInfo.setIat(jwt.getClaims().get("iat").asLong());
			cookieInfo.setIss(jwt.getClaims().get("iss").asString());
			cookieInfo.setAud(jwt.getClaims().get("aud").asString());
			cookieInfo.setJti(jwt.getClaims().get("jti").asString());
			cookieInfo.setSub(jwt.getClaims().get("sub").asString());

			Claim utClaim = jwt.getClaims().get("user_type");
			if (utClaim != null) {
				Integer userType = utClaim.asInt();
				if (userType != null) {
					cookieInfo.setUserType(String.valueOf(userType));
				} else {
					cookieInfo.setUserType(utClaim.asString());
				}
			} else {
				cookieInfo.setUserType("0");
			}

			cookieInfo.setNickname(jwt.getClaims().get("nickname").asString());
			cookieInfo.setIs_bind(jwt.getClaims().get("is_bind").asString());
			cookieInfo.setName(jwt.getClaims().get("name").asString());

			cookieInfo.setIsExpired(jwt.getClaims().get("exp").asLong() < new Date().getTime() / 1000);
			cookieInfo.setIsBind(jwt.getClaims().get("is_bind").asString()
					.equalsIgnoreCase("1"));

		}
		return cookieInfo;
	}

	public String getKey() {
		return this.key;
	}

}
