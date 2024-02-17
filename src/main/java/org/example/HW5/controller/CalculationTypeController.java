package org.example.HW5.controller;

import org.example.HW5.model.NumTypes;

public class CalculationTypeController{

    public NumController getNumControllerByType(NumTypes numType) {
        NumController numController = null;
        switch (numType) {
            case COMPLEX_NUM -> numController = CNumController.getInstance();
            case REAL_NUM -> numController = null;
            case RATIONAL_NUM -> numController = null;
            case INTEGER_NUM -> numController = null;
            case NATURAL_NUM -> numController = null;
        }
        return numController;
    }
}
