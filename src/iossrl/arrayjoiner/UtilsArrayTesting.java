package iossrl.arrayjoiner;

import java.util.Random;

public class UtilsArrayTesting {

    public static int[] stringToIntArray(String arrayString) {
        arrayString = arrayString.trim()
                .replaceAll("[^\\d\\-\\s]", "")
                .trim()
                .replaceAll("\\- ", "-").replaceAll("\\s+", " ");
        if (arrayString == null || arrayString.length() == 0) {
            return new int[0];
        }
        String[] splitString = arrayString.split(" ");
        int[] intArray = new int[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            intArray[i] = Integer.parseInt(splitString[i]);
        }

        return intArray;
    }

    public static void printArr(int[] intArray) {

        if (intArray.length < 1) {
            System.out.print("[ ]");
        } else {
            System.out.print("[");
            for (int i = 0; i < intArray.length - 1; i++) {
                System.out.print(intArray[i] + " ");
            }
            System.out.print(intArray[intArray.length - 1] + "]");
        }
    }

    public static int[] generateIntArray(int maxValue, int length) {
        return generateIntArray(0, Math.max(maxValue, 0), length, 0);
    }

    public static int[] generateIntArray(int minValue, int maxValue, int minLength, int lengthDelta) {
        maxValue = Math.max(maxValue, 0);
        Random rand = new Random();

        lengthDelta = (lengthDelta > 0) ? rand.nextInt(lengthDelta) : 0;
        int[] intArr = new int[minLength + lengthDelta];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(maxValue - minValue) + minValue;
        }

        return intArr;
    }
}
