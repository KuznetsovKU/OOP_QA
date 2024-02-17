package org.example.HW5.service;

import org.example.HW5.model.CNum;
import org.example.HW5.operations.CNumAddition;
import org.example.HW5.operations.CNumDivision;
import org.example.HW5.operations.CNumMultiplication;
import org.example.HW5.operations.CNumSubtraction;

public class CNumCalculationService extends CalculationService<CNum> {

    private static CNumCalculationService instance;

    public static CNumCalculationService getInstance() {
        if (instance == null) {
            return new CNumCalculationService();
        } return instance;
    }

    private CNumCalculationService() {
    }

    @Override
    public CNum addNums(CNum num1, CNum num2) {
        return CNumAddition.getInstance().addNums(num1, num2);
    }

    @Override
    public CNum subtractNums(CNum num1, CNum num2) {
        return CNumSubtraction.getInstance().subtractNums(num1, num2);
    }

    @Override
    public CNum multiplyNums(CNum num1, CNum num2) {
        return CNumMultiplication.getInstance().multiplyNums(num1, num2);
    }

    @Override
    public CNum divideNums(CNum num1, CNum num2) {
        return CNumDivision.getInstance().divideNums(num1, num2);
    }

}
