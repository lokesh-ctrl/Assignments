import org.junit.jupiter.api.Test;

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
}
