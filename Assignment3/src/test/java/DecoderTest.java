import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoderTest {
    final Decoder decoder=new Decoder();
    @Test
    void shouldReturnEmptyStringForEmptyString(){
        assertEquals("",decoder.decode(""));
    }
    @Test
    void shouldReturna1Fora(){
        assertEquals("a",decoder.decode("a1"));
    }
    @Test
    void shouldReturnConsecutiveLetterBasedOnNumber(){
        assertEquals("aaaaa",decoder.decode("a5"));
    }
    @Test
    void shouldReturnDecodedMessageForAGivenEncodedMessage(){
        assertEquals("a2###fV",decoder.decode("a121#3f1V1"));
    }

}