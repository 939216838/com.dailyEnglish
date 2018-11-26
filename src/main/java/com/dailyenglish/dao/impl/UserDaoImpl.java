package com.dailyenglish.dao.impl;

import com.dailyenglish.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @className UserDaoImpl
 * @Description TODO
 * @Author Shan-HongFeng
 * @Date 2018年11月22日 21:32
 * @Vsersion 1.0
 **/
@Component

public class UserDaoImpl implements UserDao {

//	private final JdbcTemplate jdbcTemplate;

//	@Autowired
//	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public String findOneUser(String logname, String logpass) {
		Integer num = null;
		try {

			String sql = "SELECT count(1) as c FROM customer WHERE username = ? AND password =?";

			Object[] parameter = new Object[]{logname, logpass};
//			Object[] parameter = new Object[]{"shanhongfeng", "202cb962ac59075b964b07152d234b70"};
//			num = jdbcTemplate.queryForObject(sql, parameter, Integer.class);

			if (num == 0) {
				return null;
			} else {
				return "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
