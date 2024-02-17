package org.example.HW5.operations;

import org.example.HW5.model.CNum;

public class CNumDivision implements Division<CNum>{
    CNumMultiplication cNumMultiplication = CNumMultiplication.getInstance();

    private static CNumDivision instance;

    public static CNumDivision getInstance() {
        if (instance == null) {
            return new CNumDivision();
        } return instance;
    }

    private CNumDivision() {
    }

    @Override
    public CNum divideNums(CNum num1, CNum num2) {
        CNum conjugateNum = new CNum(num2.getA(), num2.getB() * -1);
        CNum numerator = cNumMultiplication.multiplyNums(num1, conjugateNum);
        CNum denominator = cNumMultiplication.multiplyNums(num2, conjugateNum);
        return new CNum(numerator.getA() / denominator.getA(), numerator.getB() / denominator.getA());
    }


}
