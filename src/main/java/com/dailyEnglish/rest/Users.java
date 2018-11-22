package com.dailyEnglish.rest;

import com.alibaba.fastjson.JSON;
import com.dailyEnglish.pojo.User;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class Users {


    @PostMapping("/users")
    @ResponseBody
    public String postUser(@RequestBody String json) {

        System.out.println(json);
        User user = JSON.parseObject(json, User.class);
        System.out.println(user);

        return "注册成功";
    }

    @PostMapping("/users/login")
    @ResponseBody
    public String login(@RequestParam(value = "username") String username) {
        return "登录成功";
    }


}
