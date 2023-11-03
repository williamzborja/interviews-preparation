package variables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Primitive {
    @Test
    public void numbers() {
        int number = 12;
        assertEquals(12, number);
    }

    @Test
    public void floats() {
        float number = 1.0F;
        double number2 = 1.0;

        assertEquals(1.0f, number);
        assertEquals(1.0f, number2);
    }

    
    @Test
    void bool(){
        boolean bool = true;
        assertTrue(bool);
    }

    @Test
    public void string_literal() {
        String text = "william"; // strings are immutable in java
    
        assertEquals("william", text);
    }

     @Test
    public void const_string_literal() {
        final String TEXT = "william"; // strings are immutable in java
    
        assertEquals("william", TEXT);
    }
}