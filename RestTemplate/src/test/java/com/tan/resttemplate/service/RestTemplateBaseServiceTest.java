package com.tan.resttemplate.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateBaseServiceTest {

    @Autowired
    RestTemplateBaseService service;

    @Test
    public void httpGetObjectRequest() {
        String url = "http://localhost:8080/api/inner/organPlatform/employee";
        service.httpPostObjectRequest(url,"");
    }
}