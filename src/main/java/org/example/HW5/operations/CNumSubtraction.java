package org.example.HW5.operations;

import org.example.HW5.model.CNum;

public class CNumSubtraction implements Subtraction<CNum>{

    private static CNumSubtraction instance;

    public static CNumSubtraction getInstance() {
        if (instance == null) {
            return new CNumSubtraction();
        } return instance;
    }
    private CNumSubtraction() {
    }

    @Override
    public CNum subtractNums(CNum num1, CNum num2) {
        return new CNum(num1.getA() - num2.getA(), num1.getB() - num2.getB());
    }
}
