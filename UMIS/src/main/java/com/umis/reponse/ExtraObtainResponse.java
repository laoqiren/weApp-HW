package com.umis.reponse;

import com.umis.entity.ExtraObtain;

public class ExtraObtainResponse extends BaseResponse {
	
	private ExtraObtain extraObtain;

	public ExtraObtainResponse(Integer code, ExtraObtain extraObtain) {
		super(code);
		setExtraObtain(extraObtain);
	}

	public ExtraObtain getExtraObtain() {
		return extraObtain;
	}

	public void setExtraObtain(ExtraObtain extraObtain) {
		this.extraObtain = extraObtain;
	}
	
	

}
