package DecoratorPattern;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    /**
     * 本类独有的方法
     */
    private void addedBehavior() {

    }

}
