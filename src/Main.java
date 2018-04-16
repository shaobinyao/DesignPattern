import DecoratorPattern.ConcreteComponent;
import DecoratorPattern.ConcreteDecoratorA;
import DecoratorPattern.ConcreteDecoratorB;
import FactoryPattern.Operation;
import FactoryPattern.OperationFactory;
import StrategyPattern.CashContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("**********简单工厂模式*********");
        Operation operation = OperationFactory.createOperation("+");
        double result = operation.getResult(23, 4.5);
        System.out.println("result:" + result);

        System.out.println("**********策略模式*********");
        CashContext cashContext = new CashContext("8折");
        result = cashContext.GetResult(293.5);
        System.out.println("result:" + result);
        //简单工厂模式需要让客户端认识两个类，CashSuper和CashFactory，
        //而策略模式与简单工厂结合的用法，客户端只需要认识CashContext一个类。
        //耦合更加降低

        //
        System.out.println("**********策略模式*********");
        ConcreteComponent concreteComponent = new ConcreteComponent(); //具体对象
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();   //具体装饰A
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();   //具体装饰B
        decoratorA.setComponent(concreteComponent);      // 用decoratorA对象来包装concreteComponent
        decoratorB.setComponent(decoratorA);            // 用decoratorB对象来包装decoratorA
        decoratorB.Operation();                         // 执行 decoratorB 的Operation()

    }
}
