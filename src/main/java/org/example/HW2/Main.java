package org.example.HW2;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Mike");
        Human h2 = new Human("Alice");
        Human h3 = new Human("John");
        Human h4 = new Human("Kate");
        Human h5 = new Human("Andy");

        Market m1 = new Market();

        m1.acceptToMarket(h1);
        m1.acceptToMarket(h2);
        m1.acceptToMarket(h3);
        m1.acceptToMarket(h4);
        m1.acceptToMarket(h5);

        m1.update();
    }
}
