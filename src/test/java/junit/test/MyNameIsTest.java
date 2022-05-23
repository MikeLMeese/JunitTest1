package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Will it print my name?")
public class MyNameIsTest {
    
    @Test
    @DisplayName("Testing the greet() method")
    void testGreet() {
        assertEquals("My name is Michael Moua.", MyNameIs.greet("Michael", "Moua"));
    }
}
