package com.dailyenglish.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dailyenglish.dao.UserDao;
import com.dailyenglish.pojo.User;
import com.dailyenglish.service.UserService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @className UserServiceImpl
 * @Description TODO
 * @Author Shan-HongFeng
 * @Date 2018年11月22日 21:21
 * @Vsersion 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public ResponseEntity<String> findOneUser(String json) {

		User user = JSONObject.parseObject(json, User.class);
		String oneUser = userDao.findOneUser(user.getUsername(), user.getPassword());
		if (StringUtil.isNullOrEmpty(oneUser)) {
			return new ResponseEntity<>("用户名或密码不正确,请检查后重新登陆", HttpStatus.UNAUTHORIZED);
		}
//		return new ResponseEntity<>(resp, headers, HttpStatus.OK);
		if (Integer.valueOf(oneUser) == 1) {
//		String resp = JSON.toJSONString(new BaseResponse<>(userOne), true);
			return new ResponseEntity<>("登陆成功", HttpStatus.OK);
		}
		return new ResponseEntity<>("用户名或密码不正确,请检查后重新登陆", HttpStatus.UNAUTHORIZED);

	}
}
