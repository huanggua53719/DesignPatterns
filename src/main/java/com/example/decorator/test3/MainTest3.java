package com.example.decorator.test3;

public class MainTest3
{
    public static void main(String[] args)
    {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteComponent);
        concreteDecoratorA.operation();
        concreteDecoratorB.operation();
    }


}
