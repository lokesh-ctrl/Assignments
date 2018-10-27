public class InnerClassSingleton {
    private InnerClassSingleton(){}
    private static class SingletonHelper{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
    public static InnerClassSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
