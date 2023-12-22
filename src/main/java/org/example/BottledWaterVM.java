package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BottledWaterVM implements VendingMachine{

    /**
     * productList == список продуктов в автомате
     * money == Сумма денег в автомате
     */
    private final List<Product> productList;
    private Integer money;

    public BottledWaterVM() {
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
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, Integer price) {
        for (Product product: productList) {
            if (product.getName().equalsIgnoreCase(name) && Objects.equals(product.getPrice(), price)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof BottledWater) {
            productList.add(product);
        }
    }


    public BottledWater getProduct(String name, double volume) {
        for (Product product: productList) {
            if (product instanceof BottledWater) {
                if (product.getName().equalsIgnoreCase(name) && ((BottledWater) product).getVolume() == volume) {
                    return (BottledWater) product;
                }
            }
        }
        return null;
    }


}
