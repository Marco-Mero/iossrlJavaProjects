package iossrl.arrayjoiner;

public class JoinUniqueArrays {

    private JoinUniqueArrays() {
    }

    private static boolean findItem(int item, int[] array, int end) {
        for (int i = 0; i < end; i++) {
            if (array[i] == item)
                return true;
        }
        return false;
    }

    private static int[] joinValidated(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        int countUniques = 1;
        merged[0] = array1[0];

        for (int i = 1; i < array1.length; i++) {
            if (!findItem(array1[i], merged, countUniques)) {
                merged[countUniques] = array1[i];
                countUniques++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (!findItem(array2[i], merged, countUniques)) {
                merged[countUniques] = array2[i];
                countUniques++;
            }
        }

        int[] uniqueJoined = new int[countUniques];
        System.arraycopy(merged, 0, uniqueJoined, 0, countUniques);
        return uniqueJoined;
    }

    public static int[] joinArrays(int[] array1, int[] array2) {
        if (array1 == null && array2 == null)
            return new int[0];

        if (array1 == null || array1.length == 0)
            return array2;

        if (array1 == null || array2.length == 0)
            return array1;
        else
            return joinValidated(array1, array2);
    }

}