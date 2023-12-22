package org.example;

public class Main {
    public static void main(String[] args) {
        HotDrink hd1 = new HotDrink("black_tea", 10, 50.0, 0.3);
        HotDrink hd2 = new HotDrink("green_tea", 10, 45.0, 0.3);
        HotDrink hd3 = new HotDrink("espresso", 15, 50.0, 0.1);
        HotDrink hd4 = new HotDrink("americano", 12, 45.0, 0.2);
        HotDrink hd5 = new HotDrink("cappuccino", 15, 40.0, 0.4);

        HotDrinkVM hdvm1 = new HotDrinkVM();

        hdvm1.addProduct(hd1);
        hdvm1.addProduct(hd2);
        hdvm1.addProduct(hd3);
        hdvm1.addProduct(hd4);
        hdvm1.addProduct(hd5);

        Product purchase1 = hdvm1.getProduct("espresso");
        System.out.println(purchase1.toString());

        Product purchase2 = hdvm1.getProduct("black_tea", 50.0);
        System.out.println(purchase2.toString());

        Product purchase3 = hdvm1.getProduct("cappuccino", (Integer) 15);
        System.out.println(purchase3.toString());

    }
}