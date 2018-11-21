package com.dailyEnglish.rest;

import com.alibaba.fastjson.JSON;
import com.dailyEnglish.pojo.Word;
import com.dailyEnglish.utils.TransApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Words {


    @PostMapping("/querywords")
    @ResponseBody
    public String postUser(@RequestBody String json) {
        Word word = JSON.parseObject(json, Word.class);


        TransApi api = new TransApi(TransApi.APP_ID, TransApi.SECURITY_KEY);

        String query = word.getQuery();
        String transResult = api.getTransResult(query, "auto", "en");
        System.out.println(transResult);

        return transResult;
    }


}
