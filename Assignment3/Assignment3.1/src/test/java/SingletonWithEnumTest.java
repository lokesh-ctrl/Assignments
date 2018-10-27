import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SingletonWithEnumTest {
    @Test
    void TestsSingletonEnum(){
        SingletonWithEnum singleton = SingletonWithEnum.INSTANCE;
        SingletonWithEnum singleton1 = SingletonWithEnum.INSTANCE;
        assertEquals(singleton,singleton1);
    }

    @Test
    void TestsSingletonEnumWithSerializationAndDeserialization() throws IOException, ClassNotFoundException {
        SingletonWithEnum singleton = SingletonWithEnum.INSTANCE;
        SingletonWithEnum singleton1 = null;
        FileOutputStream fileOutputStream = new FileOutputStream("out1.ser");
        ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(singleton);
        fileOutputStream.close();
        objectOutput.close();

        FileInputStream fileInputStream = new FileInputStream("out1.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        singleton1 = (SingletonWithEnum) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        assertEquals(singleton,singleton1);
    }

}