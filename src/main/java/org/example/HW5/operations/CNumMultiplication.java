package org.example.HW5.operations;

import org.example.HW5.model.CNum;

public class CNumMultiplication implements Multiplication<CNum> {

    private static CNumMultiplication instance;

    public static CNumMultiplication getInstance() {
        if (instance == null) {
            return new CNumMultiplication();
        } return instance;
    }

    private CNumMultiplication() {
    }

    @Override
    public CNum multiplyNums(CNum num1, CNum num2) {
        int a = (num1.getA() * num2.getA()) + (num1.getB() * num2.getB()) * -1;
        int b = (num1.getB() * num2.getA()) + (num1.getA() * num2.getB());
        return new CNum(a, b);
    }
}
