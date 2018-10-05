import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    public void ifInputisOneShouldReturnOne(){
        assertEquals("1",FizzBuzz.returnfizzBuzz(1));
    }
}
