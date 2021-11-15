package singlePattern;

/**
 * Demo HungrySingleInstance
 *
 * @author sunlianyu
 * @date 11月15日 21:40
 * 饿汉的单例模式
 */
public class SingleHungryInstance {

    private final static SingleHungryInstance SINGLE_HUNGRY_INSTANCE = new SingleHungryInstance();

    private SingleHungryInstance() {
    }

    public static SingleHungryInstance getInstance() {
        return SINGLE_HUNGRY_INSTANCE;
    }
}
