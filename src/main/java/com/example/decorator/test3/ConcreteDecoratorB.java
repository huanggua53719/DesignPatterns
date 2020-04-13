package com.example.decorator.test3;

public class ConcreteDecoratorB extends Decorator
{

    @Override
    public void operation()
    {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior()
    {
        System.out.println("具体装饰对象B的独有操作...");
    }
}
