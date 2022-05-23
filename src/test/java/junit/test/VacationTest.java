package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VacationTest {
    
    @Test
    @DisplayName("Check to see if the itinerary is listed entirely")
    void theNamesOfTheDestinationsShouldPrintOut() {
        assertEquals("I want to visit Seoul, Tokyo, and the Maldives.", 
        Vacation.itinerary("Seoul", "Tokyo", "Maldives"));
    }
}
