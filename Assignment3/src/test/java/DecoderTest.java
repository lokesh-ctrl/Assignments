import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoderTest {
    private final Decoder decoder=new Decoder();
    @Test
    void shouldReturnEmptyStringForEmptyString(){
        assertEquals("",decoder.decodeMessage(""));
    }
    @Test
    void shouldReturna1Fora(){
        assertEquals("a",decoder.decodeMessage("a1"));
    }
    @Test
    void shouldReturnConsecutiveLetterBasedOnNumber(){
        assertEquals("aaaaa",decoder.decodeMessage("a5"));
    }
    @Test
    void shouldReturnDecodedMessageForAGivenEncodedMessage(){
        assertEquals("a2###fV",decoder.decodeMessage("a121#3f1V1"));
    }

}