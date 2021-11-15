package singlePattern;

/**
 * Demo EnumSingle
 *
 * @author sunlianyu
 * @date 11月15 22:16
 * 基于枚举类型的单例模式
 * 单元素的枚举类型已经成为实现Singleton的最佳方法——————————《effective java》
 */
@SuppressWarnings("all")
public class EnumSingle {
    private EnumSingle() {
    }

    static enum SingletonEnum {
        INSTANCE;
        private EnumSingle enumSingle;

        private SingletonEnum() {
            enumSingle = new EnumSingle();
        }
        public EnumSingle getInstance(){
            return enumSingle;
        }
    }

    public static EnumSingle getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }
}