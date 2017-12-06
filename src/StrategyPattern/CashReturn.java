package StrategyPattern;

public class CashReturn implements CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyRetrun = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyRetrun = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (result >= money) {
            result = money - Math.floor(money / moneyCondition) * moneyRetrun;
        }
        return result;
    }
}
