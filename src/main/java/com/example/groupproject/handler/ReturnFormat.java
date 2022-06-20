package com.example.groupproject.handler;

import java.util.HashMap;
import java.util.Map;
/**
 * Author:甘舟
 * Data:2022/6/20
 */
public class ReturnFormat {
    private static Map<String,String> messageMap =new HashMap();
    //初始化状态码与文字说明
    static {

        messageMap.put("400", "Bad Request!");
        messageMap.put("401", "NotAuthorization");

        messageMap.put("404", "Resource is not available");

        messageMap.put("405", "Method Not Allowed");
        messageMap.put("406", "Not Acceptable");
        messageMap.put("500", "Internal Server Error");

    }
    //出现异常时调用
    public static String retParam(int code) {
        RestJson json = new RestJson(code, messageMap.get(String.valueOf(code)));
        return json.toString();
    }
    //正常时调用
    public static String retData(Object data){
        RestJson json = new RestJson(200, "ok!");
        json.setData(data);
        return json.toString();
    }
}
