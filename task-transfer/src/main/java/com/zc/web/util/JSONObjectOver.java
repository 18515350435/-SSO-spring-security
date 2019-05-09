package com.zc.web.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JSONObjectOver extends JSONObject{

    public BigDecimal getBigDecimal(String key) {
        try{
            return super.getBigDecimal(key); 
        }catch(Exception ex){
            return new BigDecimal(0);
        }
        
    }

    public Integer getInteger(String key) {
        try{
            return super.getInteger(key); 
        }catch(Exception ex){
            return new Integer(0);
        }
        
    }

}