import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibanocciTest {
    @Test
    public void ifInputIsOneItShouldReturnOne(){
        assertEquals(1,Fibanocci.fibanocciNumber(1));
    }
    @Test
    public void ifInputIsTwoItShouldReturnOne(){

        assertEquals(1,Fibanocci.fibanocciNumber(2));
    }
    @Test
    public void ifInputIsotherThan1or2ShouldreturnPrevioousTwoNumbersSum(){
        assertEquals(5,Fibanocci.fibanocciNumber(5));
    }
    @Test
    public void ifInputIsOneFibanocciSeriesShouldReturnArrayContaingOne(){
        int[] testArray = new int[]{1};
        assertArrayEquals(testArray,Fibanocci.fibanocciSeries(1));
    }
    @Test
    public void returnsArrayofFibanocciNumbers(){
        int[] testArray = new int[]{1,1,2,3,5,8,13,21};
        assertArrayEquals(testArray,Fibanocci.fibanocciSeries(8));
    }
}
