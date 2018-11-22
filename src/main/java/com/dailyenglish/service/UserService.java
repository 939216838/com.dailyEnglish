package com.dailyenglish.service;

import org.springframework.http.ResponseEntity;

public interface UserService {


	ResponseEntity<String> findOneUser(String logname);
}
