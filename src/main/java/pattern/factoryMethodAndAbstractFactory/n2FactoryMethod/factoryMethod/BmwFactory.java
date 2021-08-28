package pattern.factoryMethodAndAbstractFactory.n2FactoryMethod.factoryMethod;

public class BmwFactory extends CarFactory {

    @Override
    public Car getCar() {
        return new Bmw();
    }
}
