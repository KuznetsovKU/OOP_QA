package org.example.HW5.operations;

import org.example.HW5.model.CNum;

public class CNumAddition implements Addition<CNum>{

    private static CNumAddition instance;

    public static CNumAddition getInstance() {
        if (instance == null) {
            return new CNumAddition();
        } return instance;
    }

    private CNumAddition() {
    }

    @Override
    public CNum addNums(CNum num1, CNum num2) {
        return new CNum(num1.getA() + num2.getA(), num1.getB() + num2.getB());
    }
}
