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
     * Testing reformatting.
     */
    @Test
    void baseStringToIntArray() {
        int[] expected = new int[] {0, 1, 2, 3, 4};
        int[] result = UtilsArrayTesting.stringToIntArray("[ 0, 1, 2, 3, 4]");
        assertArrayEquals(expected, result);
    }

    /**
     * *stringToIntArray()
     * Testing empty string.
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
    public void testPrintArr() {
        int[] intArray = {1, 2, 3, 4};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        UtilsArrayTesting.printArr(intArray);
        assertEquals("[1 2 3 4]", outContent.toString());
    }

}
