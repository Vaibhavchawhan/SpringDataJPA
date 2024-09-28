package com.deepak.SpringbootDataJpaJSP.service;

import com.deepak.SpringbootDataJpaJSP.entity.User;

public interface UserService {
	
	public boolean registerUser(User user);
	
	public User loginUser(String email,String password);

}
