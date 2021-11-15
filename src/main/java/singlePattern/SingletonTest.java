package singlePattern;

/**
 * Demo SingletonTest
 *
 * @author sunlianyu
 * @date 11月15日 22:33
 */
public class SingletonTest {
    public static void main(String[] args) {
        Thread bThread = new Thread(new Demo());
        Thread aThread = new Thread(new Demo());
        aThread.start();
        bThread.start();
    }
}

class Demo implements Runnable {
    @Override
    public void run() {
        DemandHolderInstance instance0 = DemandHolderInstance.getInstance();
        EnumSingle instance1 = EnumSingle.getInstance();
        SingleDoubleCheckInstance instance2 = SingleDoubleCheckInstance.getInstance();
        SingleHungryInstance instance3 = SingleHungryInstance.getInstance();
        SingleStaticHungryInstance instance6 = SingleStaticHungryInstance.getInstance();
        SingleLazyInstance instance4 = SingleLazyInstance.getInstance();
        ThreadLocalSingle instance5 = ThreadLocalSingle.getInstance();

        System.out.println(Thread.currentThread().getName()+":"+instance0);
        System.out.println(Thread.currentThread().getName()+":"+instance1);
        System.out.println(Thread.currentThread().getName()+":"+instance2);
        System.out.println(Thread.currentThread().getName()+":"+instance3);
        System.out.println(Thread.currentThread().getName()+":"+instance4);
        System.out.println(Thread.currentThread().getName()+":"+instance5);
        System.out.println(Thread.currentThread().getName()+":"+instance6);
    }
}