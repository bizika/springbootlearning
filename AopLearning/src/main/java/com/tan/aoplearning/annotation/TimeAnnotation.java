package com.tan.aoplearning.annotation;

import java.lang.annotation.*;

/**
 * @author 601091
 * @date 2018/6/29
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TimeAnnotation {
    String value() default "";
}
