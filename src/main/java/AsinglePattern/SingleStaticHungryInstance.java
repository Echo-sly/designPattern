package AsinglePattern;

/**
 * Demo SingleStaticHungryInstance
 *
 * @author sunlianyu
 * @date 11月15日 21:45
 * 静态代码块执行 单例模式的加载
 */
public class SingleStaticHungryInstance {
    private static SingleStaticHungryInstance instance = null;

    static {
        instance = new SingleStaticHungryInstance();
    }

    private SingleStaticHungryInstance() {
    }

    public static SingleStaticHungryInstance getInstance() {
        return instance;
    }
}
