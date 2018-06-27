package com.tan.resttemplate.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 基于注解
 *
 * @author 601091
 * @date 2018/6/26
 */
@Component
@Slf4j
public class RestTemplateBaseService {

    @Resource(name = "restTemplate")
    RestTemplate restTemplate;

    protected <T> T httpPostObjectRequest(String url, String body) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        httpHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        httpHeaders.add("innerKey","R9g8WMlsyXCOEMu0E7vG8cwwiXeYh6LWZCmvv8c9nnfrZnrKfZaQVg");
        httpHeaders.add("orgId","130950");
        httpHeaders.add("organUnitId","7518");
        httpHeaders.add("userId","33986");

        //language=JSON
        String bodyParam = "{\"empId\": \"33986\", \"orgId\": \"130950\"}";

        HttpEntity<String> entity = new HttpEntity<>(bodyParam, httpHeaders);
        ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        System.out.println(result.toString());
        return null;
    }

    public void httpGetWithoutHeader(String url){
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

}
