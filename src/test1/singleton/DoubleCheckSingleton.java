package test1.singleton;


/**
 * 双重检测单例模式
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance = null;
    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    return new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
