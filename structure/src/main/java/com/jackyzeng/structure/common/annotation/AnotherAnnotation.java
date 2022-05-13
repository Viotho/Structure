package com.jackyzeng.structure.common.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface AnotherAnnotation {
    String value() default "";
}
