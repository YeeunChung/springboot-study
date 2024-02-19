package com.kt.cloud.springbootstudy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect     // 흩어진 관심사를 모듈화한 것
public class TimeTraceAop {

    @Around("execution(* com.kt.cloud.springbootstudy.service..*(..))")    // target: aspect를 적용하는 곳 (클래스, 메서드, ...)
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());

        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint + " " + timeMs + "ms");
        }

    }

}
