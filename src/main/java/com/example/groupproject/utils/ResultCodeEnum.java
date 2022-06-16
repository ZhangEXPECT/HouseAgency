package com.example.groupproject.utils;

/**
 * Author:甘舟
 * Data:2022/6/16
 */
public enum ResultCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    SERVICE_ERROR(202, "服务异常");
    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
