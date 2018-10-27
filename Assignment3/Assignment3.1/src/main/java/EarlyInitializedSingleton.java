import java.io.Serializable;

public class EarlyInitializedSingleton implements Serializable {
    private static EarlyInitializedSingleton instance = new EarlyInitializedSingleton();

    public static EarlyInitializedSingleton getInstance() {
        return instance;
    }

    private EarlyInitializedSingleton() { }

    private Object readResolve(){
        return instance;
    }
}
