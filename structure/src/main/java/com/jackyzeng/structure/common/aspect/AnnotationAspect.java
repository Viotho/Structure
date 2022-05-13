package com.jackyzeng.structure.common.aspect;

import com.jackyzeng.structure.common.annotation.MethodAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
public class AnnotationAspect {

    @Pointcut("@annotation(com.jackyzeng.structure.common.annotation.MethodAnnotation)")
    private void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.isAnnotationPresent(MethodAnnotation.class)) {
            MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);
            System.out.println(methodAnnotation.description());
        }
        return joinPoint.proceed();
    }
}
