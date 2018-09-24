import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharToNumberConverterTest {
    @Test
    public void stringToNumberConverterTest(){
        assertEquals("2", CharToNumberConverter.stringToNumberConverter("a"));
    }

    @Test
    public void stringToNumberConverterTest2(){
        assertEquals("2", CharToNumberConverter.stringToNumberConverter("B"));
    }

    @Test
    public void stringToNumberConverterTest3(){
        assertEquals("3", CharToNumberConverter.stringToNumberConverter("D"));
    }

    @Test
    public void stringToNumberConverterTest4(){
        assertEquals("4", CharToNumberConverter.stringToNumberConverter("g"));
    }
    @Test
    public void stringToNumberConverterTest5(){
        assertEquals("5", CharToNumberConverter.stringToNumberConverter("L"));
    }

    @Test
    public void stringToNumberConverterTest6(){
        assertEquals("0", CharToNumberConverter.stringToNumberConverter(" "));
    }
    @Test
    public void returningEmptyStringWHenSymolPassed(){
        assertEquals("", CharToNumberConverter.stringToNumberConverter("$"));
    }

    @Test
    public void returningEmptyStringWHenSymolPassed1(){
        assertEquals("", CharToNumberConverter.stringToNumberConverter("$4"));
    }


}