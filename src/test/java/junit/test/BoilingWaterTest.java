package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoilingWaterTest {
    
    @Test
    @DisplayName("See that the water is boiling")
    void numberGreaterThan212ShouldBoil() {
        assertEquals("Water is boiling!", BoilingWater.checkIfBoiling(235));
    }

    @Test
    @DisplayName("See that the water is not boiling")
    void numberLessThan212ShouldNotBoil() {
        assertEquals("Water isn't boiling yet...", BoilingWater.checkIfBoiling(190));
    }

    @Test
    @DisplayName("See that the water is starting to boil")
    void numberIsEqualTo212ShouldStartToBoil() {
        assertEquals("Water is starting to boil...", BoilingWater.checkIfBoiling(212));
    }
}
