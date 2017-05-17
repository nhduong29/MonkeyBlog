package com.nhduong.monkeyblog.user.bo.impl;
import javax.inject.Named;
import com.nhduong.monkeyblog.user.bo.UserBo;

@Named
public class UserBoImpl implements UserBo{

	@Override
	public String getMessage() {
		return "JSF 2 + Spring Integration";
	}

}
