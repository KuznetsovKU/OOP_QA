package org.example;

public class HotDrink extends Product{
    private double temperature;
    private double volume;

    public HotDrink(String name, Integer price) {
        super(name, price);
    }

    public HotDrink(String name, Integer price, double temperature, double volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" + super.toString() + ", " +
                "temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
