package com.pluralsight.calcengine;

public class Subtracker extends CalculateBase {

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);

    }

}
