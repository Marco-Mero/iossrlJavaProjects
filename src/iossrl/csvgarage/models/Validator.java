package iossrl.csvgarage.models;

public interface Validator {
    static final float MIN_PRICE = 1;

    public static void validatePrice(double price) {
        if (price < MIN_PRICE)
            throw new IllegalArgumentException("Price cannot be lower than" + MIN_PRICE);
    }

    public static void validatePlate(String plate, String vehicleType) throws IllegalAccessException {
        switch (vehicleType) {
            case "Car":
                Validator.validateCarPlate(plate);
                break;
            case "Moto":
                Validator.validateMotoPlate(plate);
                break;
            default:
                throw new IllegalAccessError("Vehicle type " + vehicleType + " cannot be validated.");
        }
    };

    public static void validateCarPlate(String plate) throws IllegalArgumentException {
        if (plate.length() != 7)
            throw new IllegalArgumentException("Expected 7 character long plate number.");
        if (plate.matches("[IOQU]"))
            throw new IllegalArgumentException("License plate cannot contain I O Q U.");
        if (!Character.isAlphabetic(plate.charAt(0)) && Character.isAlphabetic(plate.charAt(1)))
            throw new IllegalArgumentException("License plate does not begin with two letters.");
    }

    public static void validateMotoPlate(String plate) throws IllegalArgumentException {
        if (plate.length() != 6)
            throw new IllegalArgumentException(plate + "Expected 6 character long plate number.");
        if (plate.matches("[IOQU]"))
            throw new IllegalArgumentException("Licence plate cannot contain I O Q U.");
        if (!Character.isAlphabetic(plate.charAt(0)) && Character.isAlphabetic(plate.charAt(1)))
            throw new IllegalArgumentException("Licence plate does not begin with two letters.");
    }
}
