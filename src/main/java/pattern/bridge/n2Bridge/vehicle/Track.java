package pattern.bridge.n2Bridge.vehicle;

import pattern.bridge.n2Bridge.model.Model;

public class Track extends Vehicle {
    public Track(Model model) {
        super(model);
    }

    @Override
    public void drive() {
        model.drive("drive track");
    }
}
