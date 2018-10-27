import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerClassSingletonTest {
    @Test
    void TestsSIngleton(){
        InnerClassSingleton singleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton singleton2 = InnerClassSingleton.getInstance();
        assertEquals(singleton1,singleton2);
    }
}