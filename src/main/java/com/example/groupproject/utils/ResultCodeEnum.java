package com.example.groupproject.utils;

/**
 * Author:甘舟
 * Data:2022/6/16
 */
public enum ResultCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    ADD_SUCCESS(202,"添加成功"),
    ADD_FAIL(203,"添加失败"),
    UPDATE_SUCCESS(204,"修改成功"),
    UPDATE_FAIL(205,"修改失败"),
    DELETE_SUCCESS(206,"删除成功"),
    DELETE_FAIL(207,"删除失败"),
    SERVICE_ERROR(500, "服务异常");
    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
