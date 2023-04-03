package iossrl.testjunit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests my UtilsArrayTesting class.
 */
@SuppressWarnings("checkstyle:MagicNumber")
public class UtilsArrayTestingTest {
    /**
     * *stringToIntArray()
     * reformatting.
     */
    @Test
    void baseStringToIntArray() {
        int[] expected = new int[] {0, 1, 2, 3, 4};
        int[] result = UtilsArrayTesting.stringToIntArray("[ 0, 1, 2, 3, 4]");
        assertArrayEquals(expected, result);
    }

    /**
     * *stringToIntArray()
     * empty string.
     */
    void emptyStringToIntArray() {
        int[] expected = new int[0];
        int[] result = UtilsArrayTesting.stringToIntArray("");
        assertArrayEquals(expected, result);
    }

    /**
     * *printArr()
     * base case for printing tests.
     */
    @Test
    public void basePrintArr() {
        int[] intArray = {1, 2, 3, 4};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        UtilsArrayTesting.printArr(intArray);
        assertEquals("[1 2 3 4]", outContent.toString());
    }

    /**
     * *printArr()
     * printing empty array.
     */
    @Test
    public void emptyPrintArr() {
        int[] intArray = {};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        UtilsArrayTesting.printArr(intArray);
        assertEquals("[ ]", outContent.toString());
    }

    /**
    * *printArr()
    * printing array with only one position.
    */
    @Test
    public void singlePositionPrintArr() {
        int[] intArray = {1};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        UtilsArrayTesting.printArr(intArray);
        assertEquals("[1]", outContent.toString());
    }

}
