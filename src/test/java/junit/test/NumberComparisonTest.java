package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberComparisonTest {
    
    @Test
    @DisplayName("Testing first condition of compareNumbers() method")
    void shouldReturnBothNumbersAreTheSame() {
        assertEquals("Both numbers are the same", 
        NumberComparison.compareNumbers(10, 10));
    }

    @Test
    @DisplayName("Testing second condition of compareNumbers() method")
    void shouldReturnFirstNumberGreaterThanSecondNumber() {
        assertEquals("The first number was larger than the second", 
        NumberComparison.compareNumbers(23, 12));
    }

    @Test
    @DisplayName("Testing third condition of compareNumbers() method")
    void shouldReturnSecondNumberGreaterThanFirstNumber() {
        assertEquals("The second number was larger than the first", 
        NumberComparison.compareNumbers(7, 15));
    }
}
