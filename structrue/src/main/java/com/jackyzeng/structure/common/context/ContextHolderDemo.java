package com.jackyzeng.structure.common.context;

public class ContextHolderDemo implements AutoCloseable {

    private static final ThreadLocal<String> context = new ThreadLocal<>();

    public ContextHolderDemo(String value) {
        context.set(value);
    }

    public String getValue() {
        return context.get();
    }

    @Override
    public void close() {
        context.remove();
    }

    public static void main(String[] args) {
        try(ContextHolderDemo contextHolderDemo = new ContextHolderDemo("Hello")) {
            System.out.println(contextHolderDemo.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
