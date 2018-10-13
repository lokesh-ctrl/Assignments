import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberTest {
    @Test
    void shouldReturnPrimeForOne(){
        assertEquals("PRIME", Number.isPrime(1));
    }
    @Test
    void shouldReturnPrimeForTwo(){
        assertEquals("PRIME", Number.isPrime(2));
    }

    @Test
    void shouldReturnNOTPRIMEForEvenNumbersExceptTwo(){
        assertEquals("NOT PRIME", Number.isPrime(4));
    }

    @Test
    void shouldReturnNotPrimeForAllNonPrimeNumbers(){
        assertEquals("NOT PRIME", Number.isPrime(7918));
    }

    @Test
    void shouldReturnPrimeForAllPrimeNumbers(){
        assertEquals("PRIME", Number.isPrime(7919));
    }

    @Test
    void shouldThrowErrorForZeroOrLessThanZero(){
        try {
            assertEquals("", Number.isPrime(0));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
