package com.zc.common.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by yuanyong on 17/7/14.
 */
public class ExceptionUtils {
    public static String getFullStackTraceToString(Exception exception) {
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter, true));
        return stringWriter.toString();
    }
}
