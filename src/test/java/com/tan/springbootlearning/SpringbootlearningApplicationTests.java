package com.tan.springbootlearning;

import com.tan.springbootlearning.service.RestTemplateBaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootlearningApplicationTests {

    @Autowired
    RestTemplateBaseService service;

    @Test
    public void contextLoads() {
        System.out.println("1111");
    }
    @Test
    public void httpGetWithoutHeader() {
        String url = "http://localhost:8080/api/user/base/tag/get?id=20";
        service.httpGetWithoutHeader(url);
    }
}
