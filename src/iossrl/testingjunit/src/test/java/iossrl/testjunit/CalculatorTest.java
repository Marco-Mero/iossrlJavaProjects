package iossrl.testjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing calculation.
 */
@SuppressWarnings("checkstyle:MagicNumber")
public class CalculatorTest {
    /**
     * Testing calculator add.
     */
    @Test
    public void testAddiction() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 5), 7);
    }
}
