package com.umis.util;

public class JsonError {
    private Integer errCode;
    private String message;

    public JsonError(Integer errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }

    public String toJsonString() {
        return "{\"code\": " + errCode.toString() + ",\"msg\": \"" + message + "\"}";
    }

    public Integer getErrCode() {
        return errCode;
    }

    public String getMessage() {
        return message;
    }
}
