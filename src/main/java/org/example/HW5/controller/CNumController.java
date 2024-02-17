package org.example.HW5.controller;

import org.example.HW5.logger.Logger;
import org.example.HW5.model.CNum;
import org.example.HW5.service.CNumCalculationService;

public class CNumController extends NumController<CNum>{

    private static CNumController instance;

    public static CNumController getInstance() {
        if (instance == null) {
            return new CNumController();
        } return instance;
    }

    private CNumController() {
    }

    @Override
    public CNum addNums(CNum num1, CNum num2) {
        CNum result = CNumCalculationService.getInstance().addNums(num1, num2);
        Logger.getInstance().getLog("addNums", num1, num2, result);
        return result;
    }

    @Override
    public CNum subtractNums(CNum num1, CNum num2) {
        CNum result = CNumCalculationService.getInstance().subtractNums(num1, num2);
        Logger.getInstance().getLog("subtractNums", num1, num2, result);
        return result;
    }

    @Override
    public CNum multiplyNums(CNum num1, CNum num2) {
        CNum result = CNumCalculationService.getInstance().multiplyNums(num1, num2);
        Logger.getInstance().getLog("multiplyNums", num1, num2, result);
        return result;
    }

    @Override
    public CNum divideNums(CNum num1, CNum num2) {
        CNum result = CNumCalculationService.getInstance().divideNums(num1, num2);
        Logger.getInstance().getLog("divideNums", num1, num2, result);
        return result;
    }
}
