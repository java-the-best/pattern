package pattern.factoryMethodAndAbstractFactory.n1Before;

public class MersedesFactory {

    public void createCar() {
        Car car = new Mercedes();
        car.drive();
//        more code
    }
}
