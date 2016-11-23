package com.umis.reponse;

import com.umis.entity.UsersAll;

public class UsersAllResponse extends BaseResponse {
	
	private UsersAll usersAll;

	public UsersAllResponse(Integer code, UsersAll usersAll) {
		super(code);
		setUsersAll(usersAll);
	}

	public UsersAll getUsersAll() {
		return usersAll;
	}

	public void setUsersAll(UsersAll usersAll) {
		this.usersAll = usersAll;
	}
	
	

}
