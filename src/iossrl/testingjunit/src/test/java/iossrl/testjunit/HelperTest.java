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

    //  This simple test should fail, showing how JUnit behaves on failure.
    // @Test
    // void testHelperMethodFAILURE() {
    //     int result = Helper.helperMethod();

    //     assertEquals(result - 1, result);
    // }

}
