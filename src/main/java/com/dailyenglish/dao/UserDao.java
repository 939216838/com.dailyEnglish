package com.dailyenglish.dao;

import com.dailyenglish.pojo.User;

public interface UserDao {
	String findOneUser(String logname, String logpass);
}
