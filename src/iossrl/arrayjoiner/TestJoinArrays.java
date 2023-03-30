package iossrl.arrayjoiner;

public class TestJoinArrays {
    private TestJoinArrays() {
    }

    private static void testRandomArrays(int testsNumber, int maxValue, int length) throws IllegalArgumentException {
        int[] intArray1;
        int[] intArray2;
        for (int i = 0; i < testsNumber; i++) {
            intArray1 = UtilsArrayTesting.generateIntArray(maxValue, length);
            System.out.print("\nPrimo array: ");
            UtilsArrayTesting.printArr(intArray1);

            intArray2 = UtilsArrayTesting.generateIntArray(maxValue, length);
            System.out.print(" Secondo array: ");
            UtilsArrayTesting.printArr(intArray2);

            System.out.print(" Unione: ");
            UtilsArrayTesting.printArr(JoinUniqueArrays.joinArrays(intArray1, intArray2));
        }
    }

    public static void main(String[] args) {

        int[] intArray1;
        int[] intArray2;

        System.out.println(
                " ~ Unione di due array, senza duplicati.");

        if (args.length == 0) {
            System.out.println("String[] args deve contenere stringhe valide, es:\n");
            System.out.print("  ~$ <path>/TestJoinArrays \"3 2 4 7 4 5\" \"3 1 9\"\n");
            System.exit(1);
        }

        System.out.println("\n~$ Primo array:");
        intArray1 = UtilsArrayTesting.stringToIntArray(args[0]);
        UtilsArrayTesting.printArr(intArray1);

        if (args.length == 1) {
            System.out.println("\n\n~~~ Unione con [ ]:");
            intArray2 = UtilsArrayTesting.stringToIntArray("");
            UtilsArrayTesting.printArr(intArray1);
            System.exit(0);
        } else {
            System.out.println("\n~$ Secondo array:");
            intArray2 = UtilsArrayTesting.stringToIntArray(args[1]);
            UtilsArrayTesting.printArr(intArray2);
        }

        System.out.println("\n\n~~~ Unione:");
        UtilsArrayTesting.printArr(JoinUniqueArrays.joinArrays(intArray1, intArray2));

        if (args.length > 2)
            if (args[2].equals("Random.123")) {
                testRandomArrays(10, 3, 20);
            } else
                System.err.println("\nWarn! Argomenti dopo il secondo ignorati.");
    }
}
