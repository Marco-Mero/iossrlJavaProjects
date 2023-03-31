package iossrl.testjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * this class tests my mock helper clas to determine whether Junit is running
 * correctly.
 */
public class HelperTest {
    /**
     * This simple test is just run to determine whether Junit is running at all.
     */
    @Test
    void testHelperMethod() {
        int result = Helper.helperMethod();
        assertEquals(2, result);
    }
}
