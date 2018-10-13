import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {
    @Test
    public void ifInputIsOneShouldReturnPrime(){
        assertEquals("PRIME", Number.isPrime(1));
    }
    @Test
    public void ifInputIsTwoShouldReturnPrime(){
        assertEquals("PRIME", Number.isPrime(2));
    }

    @Test
    public void ifInputIsEvenNumberExceptTwoShouldReturnNOTPRIME(){
        assertEquals("NOT PRIME", Number.isPrime(4));
    }

    @Test
    public void shouldReturnNotPrimeForAllNonPrimeNumbers(){
        assertEquals("NOT PRIME", Number.isPrime(7918));
    }

    @Test
    public void shouldReturnPrimeForAllPrimeNumbers(){
        assertEquals("PRIME", Number.isPrime(7919));
    }

    @Test
    public void ifInputIsZeroOrLessThanZeroThrowError(){
        try {
            assertEquals("", Number.isPrime(0));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
