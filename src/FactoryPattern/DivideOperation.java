package FactoryPattern;

public class DivideOperation implements Operation {
    @Override
    public double getResult(double d1, double d2) {
        return d1 / d2;
    }
}
