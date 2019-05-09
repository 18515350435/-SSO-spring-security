package com.zc.common.util;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class StringUtil {
    private static DecimalFormat amountFormat = new DecimalFormat("0.00");

    public static String generatID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 金额格式化
     *
     * @param amount
     * @return
     */
    public static String amountFormat(BigDecimal amount) {
        if (amount != null && amount.compareTo(new BigDecimal("0")) != 0) {
            return amountFormat.format(amount);
        }
        return null;
    }

    public static String generatNum() {
        DateFormat formater = new SimpleDateFormat("yyMMddHHmmss");
        StringBuilder sb = new StringBuilder(formater.format(DateUtils.convertGMT8(new Date())));
        return sb.toString();
    }

    public static boolean isNullOrWhiteSpace(String str){
        if(str!=null) {
            for (int i=0;i<str.length();i++){
                if(!Character.isWhitespace(str.charAt(i)))
                {
                    return false;
                }
            }
        }
        return true;
    }



}
