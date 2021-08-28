package pattern.factoryMethodAndAbstractFactory.n2FactoryMethod.factoryMethod;

public abstract class CarFactory {

    public void createCar() {
        Car car = new Mercedes();
        car.drive();
//        more code
    }

    public abstract Car getCar();
}
