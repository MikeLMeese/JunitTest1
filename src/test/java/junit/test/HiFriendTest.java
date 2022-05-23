package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Movie quote to test")
public class HiFriendTest {
    
    @Test
    @DisplayName("Testing the hello() method.")
    void testHello() {
        assertEquals("My name is Inigo Montoya. You killed my father. Prepare to die.", 
        HiFriend.hello("Inigo Montoya"));
    }
}
