package iossrl.findmin;

public class TestMin {

    private static void testRandomArrays(int testsNumber, int maxValue, int length, int lengthdelta) {
        int[] intArray;
        final int MIN_VALUE = 1;
        for (int i = 0; i < testsNumber; i++) {
            intArray = UtilsArrayTesting.generateIntArray(MIN_VALUE, maxValue, length, 5);
            System.out.print("\nArray: ");
            UtilsArrayTesting.printArr(intArray);
            System.out.print(" Minimo:");
            System.out.print(RecursionArrayMin.findMinimum(intArray));
        }
    }

    public static void main(String[] args) {

        System.out.println("\n~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ");
        System.out.println(
                "| ~ Test di ricerca ricorsiva minimo in un array");
        System.out.println(
                "| di lunghezza 20+ con valori fra 1 e 1000.\n");
        int[] intArray;

        if (args.length > 0) {

            for (int i = 1; i < args.length; i++) {

                intArray = UtilsArrayTesting.stringToIntArray(args[0]);
                System.out.print("Array in input:");
                UtilsArrayTesting.printArr(intArray);
                System.out.println("Minimo trovato: " + RecursionArrayMin.findMinimum(intArray));

            }

        }
        testRandomArrays(20, 1000, 20, 10);
    }
}
