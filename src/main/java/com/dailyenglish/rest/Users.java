package com.dailyenglish.rest;

import com.dailyenglish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Users {
	@Autowired
	UserService userService;

	@PostMapping("/users/login")
	@ResponseBody
	public ResponseEntity<String> postUser(@RequestBody String json) {

		System.out.println(json);

		return userService.findOneUser(json);

	}

	@GetMapping("/users")
	@ResponseBody
	public String login(@RequestParam(value = "username") String username) {
		return "登录成功";
	}

}
