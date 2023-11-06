package com.example.lottery.common;
/*
* 枚举类型定义
* */
public class Constants {
  public enum ResponseCode {
    SUCCESS("0000", "成功"),
    UN_ERROR("0001", "未知失败"),
    ILLEGAL_PARAMETER("0002", "非法参数"),
    INDEX_DUP("0003", "主键冲突");

    ResponseCode(String code, String info) {
      this.code = code;
      this.info = info;
    }
    private String code;
    private String info;

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getInfo() {
      return info;
    }

    public void setInfo(String info) {
      this.info = info;
    }



  }

}
