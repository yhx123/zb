package com.lsjs.zb.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.lsjs.zb.pojo.token.Token;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨红星
 * @version 1.0.0
 * @date 2018/6/3
 * jsonview的是测试
 *
 */
@RestController
@RequestMapping("/json-view")
public class JsonViewController {

    @JsonView(Token.NeedFillIn.class)
    @PostMapping("/test")
    public Token testJsonView(@RequestBody Token token){
        return token;
    }

}
