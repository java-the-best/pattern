package pattern.factoryMethodAndAbstractFactory;

import pattern.factoryMethodAndAbstractFactory.n2FactoryMethod.FactoryMethodMain;
import pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.AbstractFactoryMain;

public class FactoryMethodAndAbstractFactoryMain {

    public static void main() {
        System.out.println("Фабричный метод:");
        FactoryMethodMain.main();
        System.out.println("Абстрактная фабрика:");
        AbstractFactoryMain.main();
    }
}
