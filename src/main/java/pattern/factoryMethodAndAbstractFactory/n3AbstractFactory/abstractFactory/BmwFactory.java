package pattern.factoryMethodAndAbstractFactory.n3AbstractFactory.abstractFactory;

public class BmwFactory implements AbstractFactory {

    @Override
    public Car getCar() {
        return new Bmw();
    }

    @Override
    public Bike getBike() {
        return new BmwBike();
    }
}
