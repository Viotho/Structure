package com.jackyzeng.structure.common.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface AnnotationTemplateContainer {
    AnnotationTemplate[] value();
}
