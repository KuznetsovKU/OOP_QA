package org.example.HW5.controller;

import org.example.HW5.operations.Addition;
import org.example.HW5.operations.Division;
import org.example.HW5.operations.Multiplication;
import org.example.HW5.operations.Subtraction;

public abstract class NumController<Number> implements Addition<Number>, Subtraction<Number>,
                                                       Division<Number>, Multiplication<Number> {

}
