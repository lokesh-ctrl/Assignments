import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameToNumberConvertTest {

    @Test
    public void nametonumberconverttest(){
        assertEquals("2792", NameToNumberConverter.nameToNumberConverter("arya"));
    }

    @Test
    public void nametonumberconvertertest2(){
        assertEquals("5654",NameToNumberConverter.nameToNumberConverter("LokI"));
    }

    @Test
    public void ifNameContainsSpace(){
        assertEquals("5466035374268",NameToNumberConverter.nameToNumberConverter("lion elephant"));
    }
}