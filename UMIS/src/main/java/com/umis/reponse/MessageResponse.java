package com.umis.reponse;

public class MessageResponse extends BaseResponse {
    private String message;

    public MessageResponse(Integer code, String message) {
        super(code);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
