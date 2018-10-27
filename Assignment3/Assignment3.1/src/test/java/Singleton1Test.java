import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Singleton1Test {
    @Test
    void TestingOfSingleton(){
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        assertEquals(singleton1,singleton2);
    }

    @Test
    void TestingOfSingletonUsingSerialzationAndDeserialization() throws IOException, ClassNotFoundException {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = null;
        FileOutputStream fileOutputStream = new FileOutputStream("out.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(singleton1);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("out.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        singleton2 = (Singleton1) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        assertEquals(singleton1,singleton2);
    }


}