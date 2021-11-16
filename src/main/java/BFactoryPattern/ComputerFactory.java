package BFactoryPattern;

/**
 * Demo ComputerFactory
 *
 * @author sunlianyu
 * @date 11月16日 21:59
 */
public class ComputerFactory {
    public static Computer getPC(String ram, String hdd, String cpu) {

        return new PC(ram, hdd, cpu);
    }

    public static Computer getServer(String ram, String hdd, String cpu) {
        return new Server(ram, hdd, cpu);

    }
}
