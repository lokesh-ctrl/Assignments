import Methods.NameToNumberConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameToNumberConvertTest {

    @Test
    void nameTonumberConvertTest(){
        assertEquals("2792", NameToNumberConverter.nameToNumberConverter("arya"));
    }

    @Test
    void nameToNumberConverterTest(){
        assertEquals("5654",NameToNumberConverter.nameToNumberConverter("LokI"));
    }

    @Test
    void ifNameContainsSpace(){
        assertEquals("5466035374268",NameToNumberConverter.nameToNumberConverter("lion elephant"));
    }
}