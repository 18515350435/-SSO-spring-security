package com.zc.web.util;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/1/4
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MathUtil {
    /**
     * 功能描述
     *
     * @Description 获取数组最大值
     * @Auther: liuxu
     * @CreateTime: 2019/1/4
     * @Version: 0.0.1
     * @param: 整型数据
     * @return: 最大值
     */
    public static int MAX(Integer[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    /**
     * 功能描述
     *
     * @Description 获取double类型数组最大值
     * @Auther: liuxu
     * @CreateTime: 2019/1/4
     * @Version: 0.0.1
     * @param:
     * @return:
     */
    public static double Max(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    /**
     * 功能描述
     *
     * @Description 计算整型平均值
     * @Auther: liuxu
     * @CreateTime: 2019/1/4
     * @Version: 0.0.1
     * @param: 整型数据
     * @return: 平均值
     */
    public static int Avg(Integer[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    /**
     * 字符串转整型，如果失败则返回0
     *
     * @param value 待转换的字符串
     */
    public static int StringToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception ex) {
            return 0;
        }
    }
    /**
     * 字符串转double，如果失败则返回0.0
     *
     * @param value 待转换的字符串
     */
    public static double StringToDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception ex) {
            return 0.0;
        }
    }

    /**
     * 保留一位小数
     */
    public static double A_DecimalFration(String value) {
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(2);
            nf.setRoundingMode(RoundingMode.UP);
            String v=nf.format(value);
            return Double.parseDouble(v);
        } catch (Exception ex) {
            return 0.0;
        }
    }
    /**
     * 输出最大值的索引，从0开始
     */
    public static int maxIndex(double... doubles) {
        int maxindex = 0;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[maxindex] < doubles[i]) {
                maxindex = i;
            }
        }
        return maxindex;
    }
}

