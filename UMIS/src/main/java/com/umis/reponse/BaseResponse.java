package com.umis.reponse;

public class BaseResponse {
    private Integer code;

    public BaseResponse(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
