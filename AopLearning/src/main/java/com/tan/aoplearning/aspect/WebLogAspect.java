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
public class WebLogAspect {

//    @Pointcut("execution(public * com.tan.aoplearning.controller..*.*(..))")
    public void webLog(){
    }

//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint) throws Throwable{
//        // 接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//
//        // 记录下请求内容
//        log.info("URL : " + request.getRequestURL().toString());
//        log.info("HTTP_METHOD : " + request.getMethod());
//        log.info("IP : " + request.getRemoteAddr());
//        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
//    }
//
//    @AfterReturning(returning = "ret",pointcut = "webLog()")
//    public void doAfterReturning(Object ret) throws Throwable{
//        // 处理完请求，返回内容
//        log.info("RESPONSE : " + ret);
//    }
}
