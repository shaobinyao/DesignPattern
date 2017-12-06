package StrategyPattern;

public class CashContext {
    private CashSuper cashSuper = null;

    /**
     * 构造函数[废弃]
     * [客户端需要判断使用哪种策略]
     *
     * @param cashSuper 传入具体的收费策略
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 构造函数
     * 将实例化具体策略的过程由客户端转移到Context类中,简单工厂的应用
     *
     * @param type 字符串，表示收费类型
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                this.cashSuper = new CashNormal();
                break;
            case "满300返100":
                this.cashSuper = new CashReturn("300", "100");
                break;
            case "8折":
                this.cashSuper = new CashRebate("0.8");
                break;
        }
    }

    /**
     * 计算收费结果
     *
     * @param money 原价
     * @return 收费结果
     */
    public double GetResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
