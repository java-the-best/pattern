package pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.abstractFactory;

public class MersedesFactory implements AbstractFactory {

    @Override
    public Car getCar() {
        return new Mercedes();
    }

    @Override
    public Bike getBike() {
        return new MercedesBike();
    }
}
