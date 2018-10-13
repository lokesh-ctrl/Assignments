import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibanociTest {
    @Test
    void shouldReturnOneForOne(){
        assertEquals(1,Fibanocci.fibanocciNumber(1));
    }
    @Test
    void shouldReturnOneForTwo(){

        assertEquals(1,Fibanocci.fibanocciNumber(2));
    }
    @Test
    void shouldReturnPreviousTwoNumbersSum(){
        assertEquals(5,Fibanocci.fibanocciNumber(5));
    }
    @Test
    void shouldReturnArrayContainingOneForOne(){
        int[] testArray = new int[]{1};
        assertArrayEquals(testArray,Fibanocci.fibanocciSeries(1));
    }
    @Test
    void shouldReturnArrayOfFibanociNumbers(){
        int[] testArray = new int[]{1,1,2,3,5,8,13,21};
        assertArrayEquals(testArray,Fibanocci.fibanocciSeries(8));
    }
    @Test
    void shouldThrowErrorIfInputIsLessThanOrEqualToZero(){
        try {
            assertEquals("",Fibanocci.fibanocciNumber(-1));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
