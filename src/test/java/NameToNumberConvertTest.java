import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameToNumberConvertTest {

    @Test
    public void nametonumberconverttest(){
        assertEquals("2792", NameToNumberConverter.nameToNumberConvertTest("arya"));
    }

    @Test
    public void nametonumberconvertertest2(){
        assertEquals("5654",NameToNumberConverter.nameToNumberConvertTest("LokI"));
    }

    @Test
    public void ifNameContainsSpace(){
        assertEquals("5466035374268",NameToNumberConverter.nameToNumberConvertTest("lion elephant"));
    }
}