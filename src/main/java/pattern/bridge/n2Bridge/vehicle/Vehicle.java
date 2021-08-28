package pattern.bridge.n2Bridge.vehicle;

import pattern.bridge.n2Bridge.model.Model;

public abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    public abstract void drive();
}
