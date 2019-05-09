package com.zc.api.model.util.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * @Description 实体操作工具类
 * @Author       Peihan.Zhang
 * @CreateTime  2018/4/19
 * @Email       zhangpeihan@jchzbj.com
 */
public class EntityUtil implements Serializable {
    private static final long serialVersionUID = -2528865464431932160L;
    private static long lastTime = System.currentTimeMillis();
    private static Integer sufint = Integer.valueOf(0);
    private static final Logger logger = LoggerFactory
            .getLogger(EntityUtil.class);
    public EntityUtil() {
    }
    /**
     * @Description 获取long型唯一主键
     * @Author       Peihan.Zhang
     * @CreateTime  2018/4/19
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     */
    public static synchronized long getAutoId() {
        Integer result = sufint;
        synchronized(sufint) {
            long currentTime = System.currentTimeMillis();
            if(lastTime != currentTime) {
                lastTime = currentTime;
                sufint = Integer.valueOf(0);
            } else {
                Integer e = sufint;
                sufint = Integer.valueOf(sufint.intValue() + 1);
                if(sufint.intValue() >= 1000) {
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException var6) {
                        var6.printStackTrace();
                    }

                    ++lastTime;
                    sufint = Integer.valueOf(0);
                }
            }
        }

        long result1 = (lastTime - 1420041600000L) * 1000L + (long)sufint.intValue();
        return result1;
    }
    public static void main(String[] args) {
    	System.out.println(getAutoId() );
    }
    /**
     * @Description 将同名的属性复制另一类型实体内返回
     * @Author       Peihan.Zhang
     * @CreateTime  2018/4/19
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     * @param       from 参照实体
     * @param       toClass 返回实体类型
     */
    public static <T,R> T copyProperties(R from,Class<T> toClass) {
        try {
            T t=toClass.newInstance();
            BeanUtils.copyProperties(from, t);
            return t;
        } catch (Exception e) {
            logger.error("将同名的属性复制另一类型实体内返回异常", e);
            return null;
        }
    }
    /**
     * @Description 将List集合中每个实体的同名的属性复制另一类型实体List集合内返回
     * @Author       Peihan.Zhang
     * @CreateTime  2018/4/19
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     * @param       listFrom 参照list集合
     * @param       toClass 返回List中实体类型
     */
    public static <T,R> List<T> copyListProperties(List<R> listFrom, Class<T> toClass) {
        try {
            List<T> listR=new ArrayList<>();
            for (R r:listFrom) {
                T t=toClass.newInstance();
                BeanUtils.copyProperties(r, t);
                listR.add(t);
            }
            return listR;
        } catch (Exception e) {
            logger.error("将List集合中每个实体的同名的属性复制另一类型实体List集合内返回异常", e);
            return null;
        }
    }
}