package org.example;

public interface VendingMachine {

    Product getProduct(String name);
    Product getProduct(String name, Integer price);
    void addProduct(Product product);

}
