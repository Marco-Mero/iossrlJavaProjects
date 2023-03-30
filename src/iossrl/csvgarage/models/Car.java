package iossrl.csvgarage.models;

public class Car extends Vehicle {
    public static final int WHEEL_NUMBER = 4;

    public Car(String brand, String model, double price, String plate) {
        super(brand, model, price, plate);
    }

    @Override
    public int getWheelNumber() {
        return Car.WHEEL_NUMBER;
    }
}
