package com.jackyzeng.structure.common.enums;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EnumTemplate {
    ENUM1("Hi") {
        @Override
        public void method() {

        }
    },
    ENUM2("Hello"){
        @Override
        public void method() {

        }
    };

    private final String value;

    EnumTemplate(String value) {
        this.value = value;
    }

    public abstract void method();

    // If Override toString()
    // Implementing a fromString method on an enum type
    private static final Map<String, EnumTemplate> stringToEnum =
            Stream.of(values()).collect(
                    Collectors.toMap(Object::toString, e -> e));

    // Returns EnumTemplate for string, if any
    public static Optional<EnumTemplate> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    @Override
    public String toString() {
        return value;
    }
}
