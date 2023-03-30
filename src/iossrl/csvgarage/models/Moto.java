package iossrl.csvgarage.models;

public class Moto extends Vehicle {
    public static final int WHEEL_NUMBER = 2;

    public Moto(String brand, String model, double price, String plate) {
        super(brand, model, price, plate);
    }

    @Override
    public int getWheelNumber() {
        return Moto.WHEEL_NUMBER;
    }
}
