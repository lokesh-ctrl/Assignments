import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    public void ifInputisOneShouldReturnOne(){
        assertEquals("1",FizzBuzz.returnfizzBuzz(1));
    }

    @Test
    public void returnsSameNumber(){
        assertEquals("11",FizzBuzz.returnfizzBuzz(11));
    }

    @Test
    public void ifInputisThreeShouldReturnFizz(){
        assertEquals("Fizz",FizzBuzz.returnfizzBuzz(3));
    }

    @Test
    public void ifInputIsMultipleOfThreeShouldReturnFizz(){

        assertEquals("Fizz",FizzBuzz.returnfizzBuzz(99));
    }
}
