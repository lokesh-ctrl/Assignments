import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EncoderTest {
    private final Encoder encoder = new Encoder();

    @Test
    void shouldReturna1fora(){
        assertEquals("a1",encoder.encodeMessage("a"));
    }
    @Test
    void shouldReturnLetterPlusNumberOfRepetitionOfThatLetter(){
        assertEquals("a5",encoder.encodeMessage("aaaaa"));
    }
    @Test
    void shouldReturnLetterPlusNumberOfConsecutiveRepetitionsOfThatLetter(){
        assertEquals("a1b2",encoder.encodeMessage("abb"));
    }
    @Test
    void shouldReturnEncodedMessageForGivenMessage(){
        assertEquals("h1e1l2o1",encoder.encodeMessage("hello"));
    }
}