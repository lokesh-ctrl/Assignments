import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageTest {
    Message message = new Message();

    @Test
    void shouldReturna1fora(){
        assertEquals("a1",message.encode("a"));
    }
    @Test
    void shouldReturnLetterPlusNumberOfRepetitionOfThatLetter(){
        assertEquals("a5",message.encode("aaaaa"));
    }
    @Test
    void shouldReturnLetterPlusNumberOfConsecutiveRepetitionsOfThatLetter(){
        assertEquals("a1b2",message.encode("abb"));
    }
}