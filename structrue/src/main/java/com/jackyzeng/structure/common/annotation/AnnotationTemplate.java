package com.jackyzeng.structure.common.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Repeatable(AnnotationTemplateContainer.class)
public @interface AnnotationTemplate {
    String value() default "";
}
