package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {
@Autowired
UserDao userdao;

public String StoreUser(User user) {
	if(user.getMartial_status().equals("unmarried")) {
		return "user Should me married";
		}
	else if(userdao.storeUserDetails(user)>0) {
		return "User stored Successfully";
	}
	else {
		return "User doesn't stored";
	}
	
	
}
public String UpdateUser(User user) {
	if(userdao.updateUserDetails(user)==0) {
		return "user doesn't find";
		}
	
	else {
		return "User updated";
	}
	
	
}

public String SearchUser(int uid) {
	User u=userdao.searchUserDetails(uid);
	if(u==null) {
		return "user doesn't find";
		}
	
	else {
		return u.toString();
	}
	
	
}
}
