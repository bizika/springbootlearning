package com.tan.aoplearning.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author 601091
 * @date 2018/6/28
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
