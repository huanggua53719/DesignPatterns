package com.example.decorator.test2;

public class MainTest2
{
    public static void main(String[] args)
    {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();

        dtx.show();
        kk.show();
        pqx.show();
        xc.show();

        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();

        xz.show();
        ld.show();
        px.show();
        xc.show();

    }
}
