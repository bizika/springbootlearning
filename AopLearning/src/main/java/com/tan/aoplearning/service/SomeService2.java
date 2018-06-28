package com.tan.aoplearning.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author 601091
 * @date 2018/6/28
 */
@Service
@Slf4j
public class SomeService2 {

    private Random random = new Random(System.currentTimeMillis());

    public void someMethod() {
        log.info("---SomeService: someMethod invoked---");
        try {
            // 模拟耗时任务
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void someMethod1() {
        log.info("---SomeService: someMethod invoked---");
        try {
            // 模拟耗时任务
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
