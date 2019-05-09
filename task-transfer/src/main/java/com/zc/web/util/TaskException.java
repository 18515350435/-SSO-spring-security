package com.zc.web.util;

public class TaskException extends RuntimeException{

    public TaskException() {
        super("定时任务执行异常!");
    }

    public TaskException(String message) {
        super("定时任务执行异常: "+message);
    }


}