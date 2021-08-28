package pattern.factoryMethodAndAbstractFactory.n2FactoryMethod.factoryMethod;

public class MersedesFactory extends CarFactory {

    @Override
    public Car getCar() {
        return new Mercedes();
    }
}
