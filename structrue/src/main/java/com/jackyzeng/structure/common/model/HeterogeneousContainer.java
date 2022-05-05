package com.jackyzeng.structure.common.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HeterogeneousContainer {
    private Map<Class<?>, Object> container = new HashMap<>();

    public <T> void put(Class<T> type, T instance ) {
        container.put(Objects.requireNonNull(type), type.cast(instance));
    }

    public <T> T get(Class<T> type) {
        return type.cast(container.get(type));
    }
}
