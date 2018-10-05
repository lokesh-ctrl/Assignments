import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {
    @Test
    public void ifInputIsOneShouldReturnPrime(){
        assertEquals("PRIME",PrimeNumber.findPrime(1));
    }
    @Test
    public void ifInputIsTwoShouldReturnPrime(){
        assertEquals("PRIME",PrimeNumber.findPrime(2));
    }

    @Test
    public void ifInputIsEvenNumberExceptTwoShouldReturnNOTPRIME(){
        assertEquals("NOT PRIME",PrimeNumber.findPrime(4));
    }

    @Test
    public void shouldReturnNotPrimeForAllNonPrimeNumbers(){
        assertEquals("NOT PRIME",PrimeNumber.findPrime(7918));
    }

    @Test
    public void shouldReturnPrimeForAllPrimeNumbers(){
        assertEquals("PRIME",PrimeNumber.findPrime(7919));
    }

    @Test
    public void ifInputIsZeroOrLessThanZeroThrowError(){
        try {
            assertEquals("",PrimeNumber.findPrime(0));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
