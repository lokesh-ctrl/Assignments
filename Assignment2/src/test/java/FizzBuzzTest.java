import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FizzBuzzTest {
    @Test
    void shouldReturnOneForOne(){
        assertEquals("1",FizzBuzz.returnFizzBuzz(1));
    }
    @Test
    void shouldReturnSameNumber(){
        assertEquals("11",FizzBuzz.returnFizzBuzz(11));
    }
    @Test
    void shouldReturnFizzForThree(){
        assertEquals("Fizz",FizzBuzz.returnFizzBuzz(3));
    }
    @Test
    void shouldReturnFizzForMultipleOfThree(){
        assertEquals("Fizz",FizzBuzz.returnFizzBuzz(99));
    }
    @Test
    void shouldReturnBuzzForFive(){
        assertEquals("Buzz",FizzBuzz.returnFizzBuzz(5));
    }
    @Test
    void shouldReturnBuzzForMultipleOfFive(){
        assertEquals("Buzz",FizzBuzz.returnFizzBuzz(100));
    }
    @Test
    void shouldReturnFizzBuzzForMultipleOfBothThreeAndFIve(){
        assertEquals("FizzBuzz",FizzBuzz.returnFizzBuzz(60));
    }
    @Test
    void shouldThrowErrorIfInputIsLessThanOrEqualToZero(){
        try {
            assertEquals("",FizzBuzz.returnFizzBuzz(0));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
