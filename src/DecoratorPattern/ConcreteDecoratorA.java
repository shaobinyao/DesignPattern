package DecoratorPattern;

public class ConcreteDecoratorA extends Decorator {

    private String addedState; //本类独有功能

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
