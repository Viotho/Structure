package com.jackyzeng.structure.common.annotation;

import java.lang.reflect.Field;

@AnnotationTemplate("Hi")
@AnnotationTemplate("Hello")

public class AnnotationCheckDemo {

    @AnotherAnnotation("Hello from another annotation.")
    private String field;

    public static void main(String[] args) {
        Class<?> testClass = AnnotationCheckDemo.class;
        if (testClass.isAnnotationPresent(AnnotationTemplate.class) || testClass.isAnnotationPresent(AnnotationTemplateContainer.class)) {
            for (Field field : testClass.getDeclaredFields()) {
                if (field.isAnnotationPresent(AnotherAnnotation.class)) {
                    AnotherAnnotation[] annotations = field.getAnnotationsByType(AnotherAnnotation.class);
                    for (AnotherAnnotation anotherAnnotation : annotations) {
                        System.out.println(anotherAnnotation.value());
                    }
                }
            }
        }
    }
}
