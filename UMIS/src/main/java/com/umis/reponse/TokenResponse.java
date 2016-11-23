package com.umis.reponse;

public class TokenResponse extends BaseResponse {
    private String token;
    private Integer level;
    private Long expires_in;

    public TokenResponse(Integer code,String token, Long expires_in, Integer level) {
        super(code);
        this.token = token;
        this.expires_in = expires_in;
        this.level = level;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Long expires_in) {
        this.expires_in = expires_in;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
