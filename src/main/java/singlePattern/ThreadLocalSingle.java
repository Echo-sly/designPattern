package singlePattern;

/**
 * Demo ThreadLocalSingle
 *
 * @author sunlianyu
 * @date 11月15日 22:29
 * 基于 ThreadLocal 的一种单例模式
 */
public class ThreadLocalSingle {
    private static final ThreadLocal<ThreadLocalSingle> THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalSingle::new);

    private ThreadLocalSingle() {
    }

    public static ThreadLocalSingle getInstance() {
        return THREAD_LOCAL.get();
    }

}
