package pattern.bridge.n2Bridge.vehicle;

import pattern.bridge.n2Bridge.model.Model;

public class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("drive car");
    }
}
