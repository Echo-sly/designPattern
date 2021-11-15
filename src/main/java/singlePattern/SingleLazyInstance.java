package singlePattern;

/**
 * Demo LazySingleInstance
 *
 * @author sunlianyu
 * @date 11月15日 21:33
 * 单例模式的懒加载
 */
public class SingleLazyInstance {

    private static SingleLazyInstance SINGLE_INSTANCE = null;

    private SingleLazyInstance() {
    }

    public static SingleLazyInstance getInstance() {
        if (SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new SingleLazyInstance();
        }
        return SINGLE_INSTANCE;
    }
}
