package iossrl.isbeforemax;

public class TestRecursiveSearch {
    public static void main(String[] args) {
        System.out.println("~~~ ~~~ ~~~ ~~~ ~~~ ~~~");
        System.out.println("~ Test ricerca di valore in array statici");
        System.out.println("");

        System.out.println("Nullproofing");
        RecursiveArraySearch.isMaxBeforeItem(new int[] {}, 2);

        System.out.println("\nSingolo elemento:([2], 2)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { 2 }, 2);

        System.out.println("\nPrimo test: ([1, 4, 2, 3, 2], 2)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { 1, 4, 2, 3, 2 }, 2);

        System.out.println("\nSecondo test: ([2, 3, 5, 19, -1], -1)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { 2, 3, 5, 19, -1 }, -1);

        System.out.println("\nTerzo test: ([2, 12, 5, 19, -1, 45, 12, 12], 12)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { 2, 12, 5, 19, -1, 45, 12, 12 }, 12);

        System.out.println("\nQuarto test: ([2, 3, 5, 45, 1, 1, 45], -1)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { 2, 3, 5, 45, -1, -1, 45 }, -1);

        System.out.println("\nQuinto test: ([-12, -21, 5, -6, -7, -8], -21)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { -12, -21, 5, -6, -7, -8 }, -21);

        System.out.println("\nTerzo test: ([30, 12, 45, 12, 12], 12)");
        RecursiveArraySearch.isMaxBeforeItem(new int[] { 30, 12, 45, 12, 12 }, 12);

    }
}
