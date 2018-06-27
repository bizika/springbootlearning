package com.tan.resttemplate.service;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

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

    protected <T> T httpGetObjectRequest(String url, String body) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        httpHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        httpHeaders.add("innerKey","R9g8WMlsyXCOEMu0E7vG8cwwiXeYh6LWZCmvv8c9nnfrZnrKfZaQVg");
        httpHeaders.add("orgId","130950");
        httpHeaders.add("organUnitId","7518");
        httpHeaders.add("userId","33986");

        Map param = Maps.newHashMap();

        HttpEntity<String> entity = new HttpEntity<String>(body, httpHeaders);
        ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, null, String.class, param);

        return null;
    }

    public void httpGetWithoutHeader(String url){
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

}
