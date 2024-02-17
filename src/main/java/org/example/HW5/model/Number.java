package org.example.HW5.model;

public abstract class Number {
    protected int a;

    public Number(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return Integer.toString(this.a);
    }
}
