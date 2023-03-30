package iossrl.isbeforemax;

public class RecursiveArraySearch {

    public static int findFirstMaxIndex(int[] array) {
        switch (array.length) {
            case 0:
                return -1;
            case 1:
                return 0;
            default:
                int currentMaxIndex = 0;
                int max = -1;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        currentMaxIndex = i;
                    } else if (array[i] == max) {
                        continue;
                    }
                }
                return currentMaxIndex;
        }
    }

    public static boolean isMaxBeforeItem(int[] array, int toFind) {
        switch (array.length) {
            case 0:
                System.out.println("Warn: Array nullo in ingresso.");
                return false;
            case 1:
                System.out.println("L'array contiene solo: " + toFind);
                return (toFind == array[0]);
            default:
                int maxIndex = findFirstMaxIndex(array);
                int max = array[findFirstMaxIndex(array)];
                return isMaxBeforeItem(array, toFind, max, maxIndex, 0, 0);
        }
    }

    private static boolean isMaxBeforeItem(
            int[] array, int toFind,
            int max, int maxIndex,
            int occurrences, int currentIndex) {

        if (currentIndex < array.length) {
            if (currentIndex > maxIndex && occurrences == 0) {
                System.out.println("Valore non trovato prima del massimo.");
                return false;
            }
            if (array[currentIndex] == toFind) {
                occurrences++;
            }
            currentIndex++;
            return isMaxBeforeItem(array, toFind, max, maxIndex, occurrences, currentIndex);
        }

        System.out.println((occurrences != 0) ? "Il valore compare nell'array: " + occurrences + " volte." : "");

        return (occurrences == 0) ? false : true;

    }

}
