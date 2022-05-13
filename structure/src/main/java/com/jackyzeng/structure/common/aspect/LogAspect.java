package com.jackyzeng.structure.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Slf4j
//@Aspect
//@Component
public class LogAspect {

//    @Pointcut("execution(* com.jackyzeng.structure.db.controller..*.*(..))")
//    public void pointCut(){
//
//    }
//
//    @Before("pointCut()")
//    public void before() {
//        log.info("Before log");
//    }
//
//    @After("pointCut()")
//    public void after() {
//        log.info("After log");
//    }
//
//    @AfterReturning("pointCut()")
//    public void afterReturning() {
//        log.info("After returning log");
//    }
//
//    @AfterThrowing("pointCut()")
//    public void afterThrowing() {
//        log.info("After throwing log");
//    }
//
//    @Around("pointCut()")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        log.info("Before Around");
//        joinPoint.proceed();
//        log.info("After around");
//    }
}
