package pattern.factoryMethodAndAbstractFactory.n2FactoryMethod;

import pattern.factoryMethodAndAbstractFactory.n2FactoryMethod.factoryMethod.CarFactory;
import pattern.factoryMethodAndAbstractFactory.n2FactoryMethod.factoryMethod.MersedesFactory;

public class FactoryMethodMain {

    public static void main() {
        CarFactory carFactory = new MersedesFactory();
        carFactory.createCar();
    }
}
