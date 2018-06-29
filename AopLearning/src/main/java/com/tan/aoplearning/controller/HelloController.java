package com.tan.aoplearning.controller;

import com.tan.aoplearning.service.AnnotationAspectService;
import com.tan.aoplearning.service.SomeService;
import com.tan.aoplearning.service.SomeService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 601091
 * @date 2018/6/28
 */
@RestController
public class HelloController {

    @Autowired
    SomeService someService;

    @Autowired
    SomeService2 someService2;

    @Autowired
    AnnotationAspectService annotationAspectService;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
//        someService.someMethod();
//        someService.someMethod1();
//        someService2.someMethod();
//        someService2.someMethod1();
        annotationAspectService.someMethod();
        annotationAspectService.someMethod2();
        return "Hello " + name;
    }
}
