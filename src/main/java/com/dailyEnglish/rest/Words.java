package com.dailyEnglish.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class Words {


    @PostMapping("/querywords")
    @ResponseBody
    public String postUser(@RequestBody String json) {


        return "查询成功";
    }




}
