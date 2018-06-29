package com.tan.aoplearning.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 601091
 * @date 2018/6/28
 */
@Aspect
@Component
@Slf4j
public class TimeAspect {

//    @Pointcut("within(com.tan.aoplearning.service.*)")
//    public void pointcut() {
//    }
//
//    @Around("pointcut()")
//    public Object methodInvokeExpiredTime(ProceedingJoinPoint pjp) throws Throwable {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        // 开始
//        Object retVal = pjp.proceed();
//        stopWatch.stop();
//        // 结束
//
//        // 上报到公司监控平台
//        reportToMonitorSystem(pjp.getSignature().toShortString(), stopWatch.getTotalTimeMillis());
//
//        return retVal;
//    }
//
//    public void reportToMonitorSystem(String methodName, long expiredTime) {
//        log.info("---method {} invoked, expired time: {} ms---", methodName, expiredTime);
//        //
//    }
}
