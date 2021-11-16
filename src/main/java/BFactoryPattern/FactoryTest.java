package BFactoryPattern;

/**
 * Demo FactoryTest
 *
 * @author sunlianyu
 * @date 11月16日 22:03
 */
public class FactoryTest {
    public static void main(String[] args) {
        Computer pComputer = ComputerFactory.getPC("16Gb", "512Gb", "Intel CoreI7");
        Computer sComputer = ComputerFactory.getServer("1Tb", "1024Gb", "Intel Xeon E5");

        System.out.println(sComputer);
        System.out.println(pComputer);
    }
}
