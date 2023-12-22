package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotDrinkVM implements VendingMachine{

    /**
     * productList == список продуктов в автомате
     * money == Сумма денег в автомате
     */
    private final List<Product> productList;
    private Integer money;

    public HotDrinkVM() {
        this.productList = initProduct();
        this.money = 0;
    }

    private List<Product> initProduct() {
        return new ArrayList<>();
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                this.money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, Integer price) {
        for (Product product: productList) {
            if (product.getName().equalsIgnoreCase(name) && Objects.equals(product.getPrice(), price)) {
                this.money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof HotDrink) {
            productList.add(product);
        }
    }

    public HotDrink getProduct(String name, double temperature) {
        for (Product product: productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemperature() == temperature) {
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
