import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton1 ourInstance = new Singleton1();

    public static Singleton1 getInstance() {
        return ourInstance;
    }

    private Singleton1() { }
}
