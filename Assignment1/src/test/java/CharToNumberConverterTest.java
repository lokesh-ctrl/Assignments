import Methods.CharToNumberConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharToNumberConverterTest {
    @Test
    void stringToNumberConverterTest(){
        assertEquals("2", CharToNumberConverter.stringToNumberConverter("a"));
    }

    @Test
    void stringToNumberConverterTest2(){
        assertEquals("2", CharToNumberConverter.stringToNumberConverter("B"));
    }

    @Test
    void stringToNumberConverterTest3(){
        assertEquals("3", CharToNumberConverter.stringToNumberConverter("D"));
    }

    @Test
    void stringToNumberConverterTest4(){
        assertEquals("4", CharToNumberConverter.stringToNumberConverter("g"));
    }
    @Test
    void stringToNumberConverterTest5(){
        assertEquals("5", CharToNumberConverter.stringToNumberConverter("L"));
    }

    @Test
    void stringToNumberConverterTest6(){
        assertEquals("0", CharToNumberConverter.stringToNumberConverter(" "));
    }
    @Test
    void returningEmptyStringWHenSymolPassed(){
        assertEquals("", CharToNumberConverter.stringToNumberConverter("$"));
    }

    @Test
    void returningEmptyStringWHenSymolPassed1(){
        assertEquals("", CharToNumberConverter.stringToNumberConverter("$4"));
    }


}