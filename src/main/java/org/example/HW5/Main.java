package org.example.HW5;

import org.example.HW5.controller.CNumController;
import org.example.HW5.controller.CalculationTypeController;
import org.example.HW5.model.CNum;
import org.example.HW5.model.NumTypes;


public class Main {

    public static void main(String[] args) {

        CalculationTypeController controller = new CalculationTypeController();

        CNum num1 = new CNum(1, 3);
        CNum num2 = new CNum(4, -5);
        CNum num3 = (CNum) controller.getNumControllerByType(NumTypes.COMPLEX_NUM).addNums(num1, num2);
        CNum num31 = CNumController.getInstance().addNums(num1, num2);

        CNum num4 = new CNum(1, -1);
        CNum num5 = new CNum(3, 6);
        CNum num6 = (CNum) controller.getNumControllerByType(NumTypes.COMPLEX_NUM).multiplyNums(num4, num5);
        CNum num61 = CNumController.getInstance().multiplyNums(num4, num5);

        CNum num7 = new CNum(13, 1);
        CNum num8 = new CNum(7, -6);
        CNum num9 = (CNum) controller.getNumControllerByType(NumTypes.COMPLEX_NUM).divideNums(num7, num8);
        CNum num91 = CNumController.getInstance().divideNums(num7, num8);

    }
}
