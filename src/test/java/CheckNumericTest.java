import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumericTest {
    @Test
    public void checkwhetherstringisnumberornot(){
        String s = "123";
        assertEquals(true,CheckNumeric.isNumeric(s));
    }

    @Test
    public void checkwhetherstringisnumberornot2(){
        String s = "123a";
        assertEquals(false,CheckNumeric.isNumeric(s));
    }
}