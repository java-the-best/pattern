package pattern.factoryMethodAndAbstractFactory.n1Before;

public class BmwFactory {

    public void createCar() {
        Car car = new Bmw();
        car.drive();
//        more code
    }
}
