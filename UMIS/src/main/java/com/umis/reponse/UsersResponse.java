package com.umis.reponse;

import com.umis.entity.Users;

public class UsersResponse extends BaseResponse{
    private Users user;

    public UsersResponse(Integer code, Users user) {
        super(code);
        setUser(user);
    }

    public Users getUsers() {
        return user;
    }

    public void setUser(Users user) {
        this.user = new Users();
        this.user.setPassWord("******");
        this.user.setUserAll(user.getUserAll());
        this.user.setUserName(user.getUserName());
        this.user.setUserNumber(user.getUserNumber());
        this.user.setBirthDate(user.getBirthDate());
        this.user.setSex(user.getSex());
        this.user.setClassNumber(user.getClassNumber());
    }
}
