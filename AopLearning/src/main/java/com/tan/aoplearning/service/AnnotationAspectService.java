package com.tan.aoplearning.service;

import com.tan.aoplearning.annotation.TimeAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author 601091
 * @date 2018/6/29
 */
@Slf4j
@Service
public class AnnotationAspectService {

    private Random random = new Random(System.currentTimeMillis());

    @TimeAnnotation
    public void someMethod() {
        log.info("---AnnotationAspectService: someMethod invoked---");
        try {
            // 模拟耗时任务
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void someMethod2() {
        log.info("---AnnotationAspectService: someMethod2 invoked---");
        try {
            // 模拟耗时任务
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
