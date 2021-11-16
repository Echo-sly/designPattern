package AsinglePattern;

/**
 * Demo SingleDoubleCheckInstance
 *
 * @author sunlianyu
 * @date 11月15日 21:50
 * 基于双重检查锁的一种单例模式
 */
public class SingleDoubleCheckInstance {

    private static volatile SingleDoubleCheckInstance instance = null;

    private SingleDoubleCheckInstance() {
    }

    public static SingleDoubleCheckInstance getInstance() {
        if (instance == null) {
            synchronized (SingleDoubleCheckInstance.class) {
                if (instance == null) {
                    instance = new SingleDoubleCheckInstance();
                }
            }
        }
        return instance;
    }
}
