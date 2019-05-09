package com.zc.base.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作码(三位数为系统常用，四位数为单独定义)
 * 
 * @create 2017-11-17 下午16:00:00
 * @author 索洵
 */
public enum CodeEnum {

  /**
   * 通用成功操作
   */
  SUCCESS(1, "true"),

  /**
   * 通用失败操作
   */
  ERROR(-1, "操作失败!请联系客服或重新操作"),

  /**
   * cookie过期
   */
  NO_COOKIE(1000, "未登录,请重新登录"),

  /**
   * redis登录token失效
   */
  NO_TOKEN(1001, "未登录,请重新登录"),

  /**
   * 登录成功后信息未完善
   */
  NO_HOSPITAL(1002, "医院信息未完善"),

  NO_RECORD(1003, "记录不存在"),

  NO_AUTH(1004, "只能查看或更新授权的信息"), ;

  private final int    code;
  private final String message;

  private CodeEnum(int _code, String _message) {
    this.code = _code;
    this.message = _message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  /**
   * 通过枚举code获取对应的message
   * 
   * @return 取不到时返回null
   * @create 2017-11-17 下午16:00:00
   * @author 索洵
   */
  public static String getMessageByCode(int code) {
    for (CodeEnum _enum : values()) {
      if (_enum.getCode() == code) {
        return _enum.getMessage();
      }
    }
    return null;
  }

  /**
   * 通过枚举code获取枚举对象
   * 
   * @return 取不到时返回null
   * @create 2017-11-17 下午16:00:00
   * @author 索洵
   */
  public static CodeEnum getByCode(int code) {
    for (CodeEnum _enum : values()) {
      if (_enum.getCode() == code) {
        return _enum;
      }
    }
    return null;
  }

  /**
   * 获取全部枚举
   * 
   * @return 取不到时返回空List,即new ArrayList<CodeEnum>()
   * @create 2017-11-17 下午16:00:00
   * @author 索洵
   */
  public List<CodeEnum> getAllEnum() {
    List<CodeEnum> list = new ArrayList<CodeEnum>();
    for (CodeEnum _enum : values()) {
      list.add(_enum);
    }
    return list;
  }

  /**
   * 获取全部枚举code
   * 
   * @return 取不到时返回空List,即new ArrayList<Integer>()
   * @create 2017-11-17 下午16:00:00
   * @author 索洵
   */
  public List<Integer> getAllEnumCode() {
    List<Integer> list = new ArrayList<Integer>();
    for (CodeEnum _enum : values()) {
      list.add(_enum.getCode());
    }
    return list;
  }
}