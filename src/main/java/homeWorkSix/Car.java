package homeWorkSix;

import java.util.Objects;

public class Car {

    private double price;
    private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }
}
