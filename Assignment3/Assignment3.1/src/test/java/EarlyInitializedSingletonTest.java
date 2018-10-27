import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class EarlyInitializedSingletonTest {
    @Test
    void TestingOfSingleton(){
        EarlyInitializedSingleton singleton1 = EarlyInitializedSingleton.getInstance();
        EarlyInitializedSingleton singleton2 = EarlyInitializedSingleton.getInstance();
        assertEquals(singleton1,singleton2);
    }

    @Test
    void TestingOfSingletonUsingSerialzationAndDeserialization() throws IOException, ClassNotFoundException {
        EarlyInitializedSingleton singleton1 = EarlyInitializedSingleton.getInstance();
        EarlyInitializedSingleton singleton2 = null;
        FileOutputStream fileOutputStream = new FileOutputStream("out.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(singleton1);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("out.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        singleton2 = (EarlyInitializedSingleton) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        assertEquals(singleton1,singleton2);
    }

}