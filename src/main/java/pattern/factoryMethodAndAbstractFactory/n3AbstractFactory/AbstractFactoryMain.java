package pattern.factoryMethodAndAbstractFactory.n3AbstractFactory;

import pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.abstractFactory.AbstractFactory;
import pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.abstractFactory.Bike;
import pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.abstractFactory.Car;
import pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.abstractFactory.MersedesFactory;

public class AbstractFactoryMain {

    public static void main() {
        AbstractFactory abstractFactory = new MersedesFactory();
        Car car = abstractFactory.getCar();
        Bike bike = abstractFactory.getBike();

        car.drive();
        bike.drive();
    }
}
