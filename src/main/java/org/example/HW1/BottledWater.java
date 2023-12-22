package org.example.HW1;

public class BottledWater extends Product{
    private double volume;

    public BottledWater(String name, Integer price) {
        super(name, price);
    }

    public BottledWater(String name, Integer price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottledWater{" +
                super.toString() + ", " +
                "volume=" + volume +
                '}';
    }
}
