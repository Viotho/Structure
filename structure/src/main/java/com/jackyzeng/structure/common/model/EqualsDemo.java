package com.jackyzeng.structure.common.model;

import java.util.Objects;

public class EqualsDemo {
    private int intValue;
    private float floatValue;
    private double doubleValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsDemo that = (EqualsDemo) o;
        return intValue == that.getIntValue() && Float.compare(that.getFloatValue(), floatValue) == 0 && Double.compare(that.getDoubleValue(), doubleValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intValue, floatValue, doubleValue);
    }
}
