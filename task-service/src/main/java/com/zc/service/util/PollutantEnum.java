package com.zc.service.util;

import java.util.ArrayList;
import java.util.List;

public enum PollutantEnum {
  SO2(1, "so2"),
  NOX(2, "nox"),
  CO(3, "co"),
  PM10(4, "pm10"),
  PM25(5, "pm25"),
  VOC(6, "voc"),
  NH3(7, "nh3"),
  BC(8, "bc"),
  OC(9, "oc");

  private final int    code;
  private final String describe;

  private PollutantEnum(int _code, String _describe) {
    this.code = _code;
    this.describe = _describe;
  }

  public int getCode() {
    return code;
  }

  public String getDescribe() {
    return describe;
  }

  /**
   * 通过枚举code获取对应的message
   */
  public static String getDescribeByCode(int code) {
    for (PollutantEnum _enum : values()) {
      if (_enum.getCode() == code) {
        return _enum.getDescribe();
      }
    }
    return null;
  }

  /**
   * 通过枚举code获取枚举对象
   */
  public static PollutantEnum getByCode(int code) {
    for (PollutantEnum _enum : values()) {
      if (_enum.getCode() == code) {
        return _enum;
      }
    }
    return null;
  }

  /**
   * 获取全部枚举
   */
  public List<PollutantEnum> getAllEnum() {
    List<PollutantEnum> list = new ArrayList<PollutantEnum>();
    for (PollutantEnum _enum : values()) {
      list.add(_enum);
    }
    return list;
  }

  /**
   * 获取全部枚举code
   */
  public List<Integer> getAllEnumCode() {
    List<Integer> list = new ArrayList<Integer>();
    for (PollutantEnum _enum : values()) {
      list.add(_enum.getCode());
    }
    return list;
  }
}