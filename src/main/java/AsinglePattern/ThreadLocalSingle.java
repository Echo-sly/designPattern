package AsinglePattern;

/**
 * Demo ThreadLocalSingle
 *
 * @author sunlianyu
 * @date 11月15日 22:29
 * 基于 ThreadLocal 的一种单例模式
 * 不能保证整个程序唯一；
 * 可以保证线程唯一；
 * 每个线程中拿到的实例都是一个；
 * 不同的线程拿到的实例不是一个；
 */
public class ThreadLocalSingle {
    private static final ThreadLocal<ThreadLocalSingle> THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalSingle::new);

    private ThreadLocalSingle() {
    }

    public static ThreadLocalSingle getInstance() {
        return THREAD_LOCAL.get();
    }

}
