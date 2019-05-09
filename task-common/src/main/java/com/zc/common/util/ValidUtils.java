package com.zc.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * 校验工具类
 * 
 * @author guofan
 *
 */
public class ValidUtils {

  private static final Logger logger = LoggerFactory.getLogger(ValidUtils.class);

  /**
   * 校验邮箱格式
   */
  public static boolean checkEmail(String value) {
    boolean flag = false;
    Pattern p1 = null;
    Matcher m = null;
    p1 = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
    m = p1.matcher(value);
    flag = m.matches();
    return flag;
  }

  /**
   * 手机号验证
   * 
   * @param str
   * @return 验证通过返回true
   */
  public static boolean isMobile(final String str) {
    Pattern p = null;
    Matcher m = null;
    boolean b = false;
    p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
    m = p.matcher(str);
    b = m.matches();
    return b;
  }

  /**
   * 电话号码验证
   * 
   * @param str
   * @return 验证通过返回true
   */
  public static boolean isPhone(final String str) {
    Pattern p1 = null, p2 = null;
    Matcher m = null;
    boolean b = false;
    p1 = Pattern.compile("^[0][1-9][0-9]{1,2}[0-9]{5,10}$"); // 验证带区号的
    p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$"); // 验证没有区号的
    if (str.length() > 9) {
      m = p1.matcher(str);
      b = m.matches();
    } else {
      m = p2.matcher(str);
      b = m.matches();
    }
    return b;
  }

  /**
   * 验证企业代码是否正确
   * 
   * @param code
   *          企业组织机构代码
   * @return
   */
  public static boolean isOrganaztionCode(String code) {

    int[] ws = { 3, 7, 9, 10, 5, 8, 4, 2 };
    String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String regex = "^([0-9A-Z]){8}-[0-9|X]$|^([0-9A-Z]){8}[0-9|X]$";
    String vCode = "";

    if (!code.matches(regex)) {
      return false;
    }
    if (code.indexOf("-") > 0) {
      vCode = String.valueOf(code.charAt(9));
    } else {
      vCode = String.valueOf(code.charAt(8));
    }

    int sum = 0;
    for (int i = 0; i < 8; i++) {
      sum += str.indexOf(String.valueOf(code.charAt(i))) * ws[i];
    }

    logger.info("sum is {}", sum);
    logger.info("sum % 11 is {}", sum % 11);

    int c9 = 11 - (sum % 11);

    String sc9 = String.valueOf(c9);
    if (11 == c9) {
      sc9 = "0";
    } else if (10 == c9) {
      sc9 = "X";
    }

    logger.info("sc9 is {}", sc9);

    return sc9.equals(vCode);
  }

  public static void main(String[] args) {
    System.out.println("22291136-0:" + isOrganaztionCode("22291136-0"));
    System.out.println("22291345-4:" + isOrganaztionCode("22291345-4"));
    System.out.println("67281381-3:" + isOrganaztionCode("67281381-3"));
    System.out.println("77593890-X:" + isOrganaztionCode("77593890-X"));
    System.out.println("68440721-4:" + isOrganaztionCode("68440721-4"));
    System.out.println("69284936-2:" + isOrganaztionCode("69284936-2"));
    System.out.println("68161309-8:" + isOrganaztionCode("68161309-8"));
    System.out.println("62311839-8:" + isOrganaztionCode("62311839-8"));
    System.out.println("22058233-X:" + isOrganaztionCode("22058233-X"));
    System.out.println("76630660-1:" + isOrganaztionCode("76630660-1"));
    System.out.println("10001820-8:" + isOrganaztionCode("10001820-8"));
    System.out.println("22053302-8:" + isOrganaztionCode("22053302-8"));
    System.out.println("43709649-8:" + isOrganaztionCode("43709649-8"));
    System.out.println("62390478-6:" + isOrganaztionCode("62390478-6"));
    System.out.println("45585954-0:" + isOrganaztionCode("45585954-0"));
    System.out.println("73315806-7:" + isOrganaztionCode("73315806-7"));
    System.out.println("41400180-4:" + isOrganaztionCode("41400180-4"));
    System.out.println("55327751-X:" + isOrganaztionCode("55327751-X"));
    System.out.println("78505672-4:" + isOrganaztionCode("78505672-4"));
    System.out.println("68129424-2:" + isOrganaztionCode("68129424-2"));
    System.out.println("757512841:" + isOrganaztionCode("757512841"));
    System.out.println("67514058-9:" + isOrganaztionCode("67514058-9"));
    System.out.println("73511027-8:" + isOrganaztionCode("73511027-8"));
    System.out.println("11931263-4:" + isOrganaztionCode("11931263-4"));
    System.out.println("92768914-9:" + isOrganaztionCode("92768914-9"));
    System.out.println("67228587-0:" + isOrganaztionCode("67228587-0"));
    System.out.println("75828061-6:" + isOrganaztionCode("75828061-6"));
    System.out.println("74354287-1:" + isOrganaztionCode("74354287-1"));
    System.out.println("11273409-2:" + isOrganaztionCode("11273409-2"));
    System.out.println("55217718-9:" + isOrganaztionCode("55217718-9"));
    System.out.println("79410852-2:" + isOrganaztionCode("79410852-2"));
    System.out.println("22052690-1:" + isOrganaztionCode("22052690-1"));
    System.out.println("76255854-5:" + isOrganaztionCode("76255854-5"));
    System.out.println("71357679-8:" + isOrganaztionCode("71357679-8"));
    System.out.println("67510377-X:" + isOrganaztionCode("67510377-X"));
    System.out.println("77990291-2:" + isOrganaztionCode("77990291-2"));
    System.out.println("73042102-6:" + isOrganaztionCode("73042102-6"));
    System.out.println("29420988-8:" + isOrganaztionCode("29420988-8"));
    System.out.println("77000476-1:" + isOrganaztionCode("77000476-1"));
    System.out.println("790770658:" + isOrganaztionCode("790770658"));
    System.out.println("22052275-9:" + isOrganaztionCode("22052275-9"));
    System.out.println("22052336-4:" + isOrganaztionCode("22052336-4"));
    System.out.println("71007554-1:" + isOrganaztionCode("71007554-1"));
    System.out.println("43563066-9:" + isOrganaztionCode("43563066-9"));
    System.out.println("77994041-7:" + isOrganaztionCode("77994041-7"));
    System.out.println("74128192-X:" + isOrganaztionCode("74128192-X"));
    System.out.println("67153007-X:" + isOrganaztionCode("67153007-X"));
    System.out.println("67511091-0:" + isOrganaztionCode("67511091-0"));
    System.out.println("62311022-2:" + isOrganaztionCode("62311022-2"));
    System.out.println("43520432-8:" + isOrganaztionCode("43520432-8"));
    System.out.println("43520225-0:" + isOrganaztionCode("43520225-0"));
    System.out.println("22060459-4:" + isOrganaztionCode("22060459-4"));
    System.out.println("55215050-9:" + isOrganaztionCode("55215050-9"));
    System.out.println("73799331-8:" + isOrganaztionCode("73799331-8"));
    System.out.println("7101916-0:" + isOrganaztionCode("7101916-0"));
    System.out.println("67512272-7:" + isOrganaztionCode("67512272-7"));
    System.out.println("56223677-9:" + isOrganaztionCode("56223677-9"));
    System.out.println("56375894-X:" + isOrganaztionCode("56375894-X"));
    System.out.println("62391373-8:" + isOrganaztionCode("62391373-8"));
    System.out.println("62374668-5:" + isOrganaztionCode("62374668-5"));
    System.out.println("43563177-6:" + isOrganaztionCode("43563177-6"));
    System.out.println("43631655-9:" + isOrganaztionCode("43631655-9"));
    System.out.println("77364386-8:" + isOrganaztionCode("77364386-8"));
    System.out.println("72994997-4:" + isOrganaztionCode("72994997-4"));
    System.out.println("22114101-8:" + isOrganaztionCode("22114101-8"));
    System.out.println("22216112-5:" + isOrganaztionCode("22216112-5"));
    System.out.println("69862296-X:" + isOrganaztionCode("69862296-X"));
    System.out.println("74282666-1:" + isOrganaztionCode("74282666-1"));
    System.out.println("757831201:" + isOrganaztionCode("757831201"));
    System.out.println("72627715-6:" + isOrganaztionCode("72627715-6"));
    System.out.println("72287270-8:" + isOrganaztionCode("72287270-8"));
    System.out.println("62390478-6:" + isOrganaztionCode("62390478-6"));
    System.out.println("67326364-9:" + isOrganaztionCode("67326364-9"));
    System.out.println("43709884-8:" + isOrganaztionCode("43709884-8"));
    System.out.println("43720414-5:" + isOrganaztionCode("43720414-5"));
    System.out.println("43523072-9:" + isOrganaztionCode("43523072-9"));
    System.out.println("55697506-5:" + isOrganaztionCode("55697506-5"));
    System.out.println("76699892-7:" + isOrganaztionCode("76699892-7"));
    System.out.println("22063131-4:" + isOrganaztionCode("22063131-4"));
    System.out.println("74281565-5:" + isOrganaztionCode("74281565-5"));
    System.out.println("29425718-5:" + isOrganaztionCode("29425718-5"));
    System.out.println("68389654-6:" + isOrganaztionCode("68389654-6"));
    System.out.println("79169060-9:" + isOrganaztionCode("79169060-9"));
    System.out.println("29445242-3:" + isOrganaztionCode("29445242-3"));
    System.out.println("43523106-X:" + isOrganaztionCode("43523106-X"));
    System.out.println("71973870-0:" + isOrganaztionCode("71973870-0"));
    System.out.println("43523020-0:" + isOrganaztionCode("43523020-0"));
    System.out.println("46695743-7:" + isOrganaztionCode("46695743-7"));
    System.out.println("43523291-9:" + isOrganaztionCode("43523291-9"));
    System.out.println("43523216-9:" + isOrganaztionCode("43523216-9"));
    System.out.println("72997979-4:" + isOrganaztionCode("72997979-4"));
    System.out.println("72997979-4:" + isOrganaztionCode("72997979-4"));
    System.out.println("67864777-2:" + isOrganaztionCode("67864777-2"));
    System.out.println("66318657-1:" + isOrganaztionCode("66318657-1"));
    System.out.println("74282622-3:" + isOrganaztionCode("74282622-3"));
    System.out.println("43563066-9:" + isOrganaztionCode("43563066-9"));
    System.out.println("72491801-X:" + isOrganaztionCode("72491801-X"));
    System.out.println("67326255-8:" + isOrganaztionCode("67326255-8"));
    System.out.println("62805419-4:" + isOrganaztionCode("62805419-4"));
    System.out.println("43720153-4:" + isOrganaztionCode("43720153-4"));
    System.out.println("79166780-4:" + isOrganaztionCode("79166780-4"));
    System.out.println("69864966-0:" + isOrganaztionCode("69864966-0"));
    System.out.println("62800173-8:" + isOrganaztionCode("62800173-8"));
    System.out.println("62805141-X:" + isOrganaztionCode("62805141-X"));
    System.out.println("55233488-5:" + isOrganaztionCode("55233488-5"));
    System.out.println("71017589-2:" + isOrganaztionCode("71017589-2"));
    System.out.println("79169418-3:" + isOrganaztionCode("79169418-3"));
    System.out.println("66315918-6:" + isOrganaztionCode("66315918-6"));
    System.out.println("X2392065-1:" + isOrganaztionCode("X2392065-1"));
    System.out.println("22060250-5:" + isOrganaztionCode("22060250-5"));
    System.out.println("673229207-9:" + isOrganaztionCode("673229207-9"));
    System.out.println("63400727-1:" + isOrganaztionCode("63400727-1"));
    System.out.println("73505958-0:" + isOrganaztionCode("73505958-0"));
    System.out.println("55696486-2:" + isOrganaztionCode("55696486-2"));
    System.out.println("68386069-0:" + isOrganaztionCode("68386069-0"));
    System.out.println("72628561-5:" + isOrganaztionCode("72628561-5"));
    System.out.println("73505516-8:" + isOrganaztionCode("73505516-8"));
    System.out.println("71018091-5:" + isOrganaztionCode("71018091-5"));
    System.out.println("22084458-X:" + isOrganaztionCode("22084458-X"));
    System.out.println("67860281-4:" + isOrganaztionCode("67860281-4"));
    System.out.println("68899083-0:" + isOrganaztionCode("68899083-0"));
    System.out.println("55230024-7:" + isOrganaztionCode("55230024-7"));
    System.out.println("742816711:" + isOrganaztionCode("742816711"));
    System.out.println("69860515-8:" + isOrganaztionCode("69860515-8"));
    System.out.println("43520127-4:" + isOrganaztionCode("43520127-4"));
    System.out.println("75521936-9:" + isOrganaztionCode("75521936-9"));
    System.out.println("43523170-5:" + isOrganaztionCode("43523170-5"));
    System.out.println("43709623-6:" + isOrganaztionCode("43709623-6"));
    System.out.println("75782435-1:" + isOrganaztionCode("75782435-1"));
    System.out.println("72628485-8:" + isOrganaztionCode("72628485-8"));
    System.out.println("78699757-7:" + isOrganaztionCode("78699757-7"));
    System.out.println("55217360-4:" + isOrganaztionCode("55217360-4"));
    System.out.println("22172566-2:" + isOrganaztionCode("22172566-2"));
    System.out.println("73538330-5:" + isOrganaztionCode("73538330-5"));
    System.out.println("17429416-8:" + isOrganaztionCode("17429416-8"));
    System.out.println("67514282-4:" + isOrganaztionCode("67514282-4"));
    System.out.println("22350091-8:" + isOrganaztionCode("22350091-8"));
    System.out.println("69788723-7:" + isOrganaztionCode("69788723-7"));
    System.out.println("71970738-1:" + isOrganaztionCode("71970738-1"));
    System.out.println("79207284-5:" + isOrganaztionCode("79207284-5"));
    System.out.println("79859118-7:" + isOrganaztionCode("79859118-7"));
    System.out.println("43523169-2:" + isOrganaztionCode("43523169-2"));
    System.out.println("40000720-1:" + isOrganaztionCode("40000720-1"));
    System.out.println("H0420141-X:" + isOrganaztionCode("H0420141-X"));
    System.out.println("67326328-6:" + isOrganaztionCode("67326328-6"));
    System.out.println("22060853-6:" + isOrganaztionCode("22060853-6"));
    System.out.println("55959797-9:" + isOrganaztionCode("55959797-9"));
    System.out.println("22060291-9:" + isOrganaztionCode("22060291-9"));
    System.out.println("70109139-8:" + isOrganaztionCode("70109139-8"));
    System.out.println("20285665-9:" + isOrganaztionCode("20285665-9"));
    System.out.println("90281238-2:" + isOrganaztionCode("90281238-2"));
    System.out.println("27991831-X:" + isOrganaztionCode("27991831-X"));
    System.out.println("20181163-5:" + isOrganaztionCode("20181163-5"));
    System.out.println("57508764-5:" + isOrganaztionCode("57508764-5"));
    System.out.println("71357880-6:" + isOrganaztionCode("71357880-6"));

  }
  
  /**
   * SpringBoot校验方法(输出所有错误的参数)
   * @param result
   * @return
   */
  public static String getBindErrorMessage(BindingResult result) {
	  String message = "";
	  if(result.hasErrors()){
		  for(ObjectError error : result.getAllErrors()){
				message = message.concat(error.getDefaultMessage()).concat(",");
			}
	  }
	  // 去掉最后一个逗号
	  if(StringUtils.isNotBlank(message)){
		  message = message.substring(0, message.length() - 1);
	  }
	  return message;
  }
  
  /**
   * SpringBoot校验方法(只输出第一个匹配的参数)
   * @param result
   * @return
   */
  public static String getBindErrorMessageOne(BindingResult result) {
	  if(result.hasErrors()){
		  for(ObjectError error : result.getAllErrors()){
			  return error.getDefaultMessage();
			}
	  }
	  return "";
  }
  
  
}
