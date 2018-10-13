import Methods.CheckNumeric;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumericTest {
    @Test
    void checkwhetherstringisnumberornot(){
        String s = "123";
        assertTrue(CheckNumeric.isNumeric(s));
    }

    @Test
    void checkwhetherstringisnumberornot2(){
        String s = "123a";
        assertEquals(false,CheckNumeric.isNumeric(s));
    }
}