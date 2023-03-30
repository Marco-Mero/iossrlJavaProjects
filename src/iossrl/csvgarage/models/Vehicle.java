package iossrl.csvgarage.models;

import java.util.StringJoiner;

public abstract class Vehicle implements Validator {
    private String brand;
    private String model;
    private String plate;
    private double price;

    public Vehicle(String brand, String model, double price, String plate) {
        brand = brand.trim().toLowerCase();
        plate = plate.replaceAll("[\\s-]+", "");
        try {
            Validator.validatePlate(plate, getVehicleType());
            Validator.validatePrice(price);
        } catch (Exception e) {
            System.err.println(" Warn! " + getVehicleType() + e.getMessage());
        }
        this.setAttributes(brand, model, price, plate);
    }

    private void setAttributes(String brand, String model, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.price = price;
    };

    public Object[] getAttributes() {
        return new Object[] {
                getBrand(),
                getModel(),
                getPrice(),
                getPlate(),
                getWheelNumber()
        };
    }

    abstract int getWheelNumber();

    public String getBrand() {
        return brand;
    };

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public double getPrice() {
        return price;
    }

    public String getVehicleType() {
        return this.getClass().getSimpleName();
    }

    public String toCSVRecord() {
        StringJoiner record = new StringJoiner(";");
        record.add(getBrand())
                .add(getModel())
                .add(Double.toString(getPrice()))
                .add(getPlate())
                .add(Integer.toString(getWheelNumber()));
        return record.toString();
    };

    public static Vehicle getVehicleFromCSVRecord(String CSVRecord) throws IllegalArgumentException {
        String[] fieldArray = CSVRecord.split(";");
        if (fieldArray.length == 5) {
            double price = Double.parseDouble(fieldArray[2]);
            int wheels = Integer.parseInt(fieldArray[4]);
            switch (wheels) {
                case 2:
                    return new Moto(fieldArray[0], fieldArray[1], price, fieldArray[3]);
                case 4:
                    return new Car(fieldArray[0], fieldArray[1], price, fieldArray[3]);
                default:
                    throw new IllegalArgumentException("Vehicles with " + wheels + "are not defined");
            }
        }
        throw new IllegalArgumentException(
                "Vehicles String[] must have 5 fields (brand, model, price, plate, wheel_number)");
    }

}
