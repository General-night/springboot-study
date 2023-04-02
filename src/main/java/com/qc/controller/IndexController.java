package com.qc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/2/21:02
 */

@Slf4j
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/welcome")
    public String welcome() {

        return "Hello SpringBoot！";
    }

}
