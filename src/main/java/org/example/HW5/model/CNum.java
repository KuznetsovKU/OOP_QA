package org.example.HW5.model;

public class CNum extends Number{
    private int b;
    private final char tail = 'i';

    public CNum(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getA() {
        return super.getA();
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        if (this.b < 0) {
            return Integer.toString(a) + Integer.toString(b) + tail;
        }
        return Integer.toString(a) + '+' + Integer.toString(b) + tail;
    }
}
