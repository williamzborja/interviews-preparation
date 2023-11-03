package variables;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Mutability {
    @Test
    public void immutable(){
        final String text = "william";

        assertEquals("william", text);
    }

    @Test
    public void mutable(){
        String text = "william";

        text = "william2";

        assertEquals("william2", text);
    }

    @Test
    public void lists(){
        // mutable
        final List<Integer> mutNums = new ArrayList<>();
        mutNums.add(1);

        assertEquals(1, mutNums.size());

        // immutable
        final List<Integer> immutableNums = List.of(1,2);

        assertThrows(UnsupportedOperationException.class, () -> {
            immutableNums.add(1);
            // array list is mutable in your internal implementation
            // you can't change this only with final
            // to reach that you need to use List.of
        });
    }
}
