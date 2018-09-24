import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberConverterTest {
    @Test
    public void stringToNumberConverterTest(){
        assertEquals("2",StringToNumberConverter.stringToNumberConverter("a"));
    }

    @Test
    public void stringToNumberConverterTest2(){
        assertEquals("2",StringToNumberConverter.stringToNumberConverter("B"));
    }

    @Test
    public void stringToNumberConverterTest3(){
        assertEquals("3",StringToNumberConverter.stringToNumberConverter("D"));
    }

    @Test
    public void stringToNumberConverterTest4(){
        assertEquals("4",StringToNumberConverter.stringToNumberConverter("g"));
    }
    @Test
    public void stringToNumberConverterTest5(){
        assertEquals("5",StringToNumberConverter.stringToNumberConverter("L"));
    }

    @Test
    public void stringToNumberConverterTest6(){
        assertEquals("0",StringToNumberConverter.stringToNumberConverter(" "));
    }
    @Test
    public void returningEmptyStringWHenSymolPassed(){
        assertEquals("",StringToNumberConverter.stringToNumberConverter("$"));
    }

    @Test
    public void returningEmptyStringWHenSymolPassed1(){
        assertEquals("",StringToNumberConverter.stringToNumberConverter("$4"));
    }


}