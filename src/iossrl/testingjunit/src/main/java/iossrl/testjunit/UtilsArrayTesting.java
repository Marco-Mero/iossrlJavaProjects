package iossrl.testjunit;

import java.util.Random;

/**
 * none of your business, maven.
 */
public final class UtilsArrayTesting {
    private UtilsArrayTesting() {
    }

    /**
     * @param originalArrayString
     * @return
     */
    public static int[] stringToIntArray(String originalArrayString) {
        String arrayString = originalArrayString.trim()
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

    /**
     * @param intArray
     */
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

    /**
     * @param maxValue
     * @param length
     * @return
     */
    public static int[] generateIntArray(int maxValue, int length) {
        return generateIntArray(0, Math.max(maxValue, 0), length, 0);
    }

    /**
     * @param minValue
     * @param initialMax
     * @param minLength
     * @param lengthDifference
     * @return
     */
    public static int[] generateIntArray(int minValue, int initialMax, int minLength, int lengthDifference) {
        int maxValue = Math.max(initialMax, 0);
        Random rand = new Random();

        int lengthDelta = (lengthDifference > 0) ? rand.nextInt(lengthDifference) : 0;
        int[] intArr = new int[minLength + lengthDelta];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(maxValue - minValue) + minValue;
        }

        return intArr;
    }
}
