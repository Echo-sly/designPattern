package singlePattern;

/**
 * Demo InstanceFactory
 *
 * @author sunlianyu
 * @date 11月15日 21:59
 * 静态内部类的一种单例模式
 * JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），会执行类的初始化。在执行类的初始化阶段期间，JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化。
 */
public class DemandHolderInstance {
    private static class InstanceHolder {
        public static DemandHolderInstance instance = new DemandHolderInstance();
    }

    public static DemandHolderInstance getInstance() {
        return InstanceHolder.instance;
    }

}
