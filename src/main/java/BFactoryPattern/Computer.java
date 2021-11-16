package BFactoryPattern;

/**
 * Demo Computer
 *
 * @author sunlianyu
 * @date 11月16日 21:46
 * 这里定义了一个Computer的抽象类.通过重写toString方法来解释工厂方法模式.
 */
public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM:" + this.getRAM() + ",HDD:" + this.getHDD() + ",CPU:" + this.getCPU();
    }
}
