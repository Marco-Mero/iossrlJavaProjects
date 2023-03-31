package iossrl.testjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * This class tests my UtilsArrayTesting class.
 */
public class UtilsArrayTestingTest {
    /**
     * no.
     */
    @Test
    @SuppressWarnings("checkstyle:MagicNumber")
    void testStringToIntArray() {
        int[] expected = new int[] {0, 1, 2, 3, 4};
        int[] result = UtilsArrayTesting.stringToIntArray("[ 0, 1, 2, 3, 4]");
        assertArrayEquals(expected, result);
    }
}
