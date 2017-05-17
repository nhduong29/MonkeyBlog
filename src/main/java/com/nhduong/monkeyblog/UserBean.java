package com.nhduong.monkeyblog;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.nhduong.monkeyblog.user.bo.UserBo;


@Named
@Scope("session") //need this, JSR-330 in Spring context is singleton by default
public class UserBean {

	@Inject
	UserBo userBo;

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String printMsgFromSpring() {
		return userBo.getMessage();
	}

}
