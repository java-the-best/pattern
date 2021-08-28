package pattern.bridge;

import pattern.bridge.n2Bridge.model.Audi;
import pattern.bridge.n2Bridge.model.Toyota;
import pattern.bridge.n2Bridge.vehicle.Car;
import pattern.bridge.n2Bridge.vehicle.Track;
import pattern.bridge.n2Bridge.vehicle.Vehicle;

public class BridgeMain {

    public static void main() {
        Vehicle vehicle = new Car(new Toyota());
        vehicle.drive();

        Vehicle vehicle2 = new Track(new Audi());
        vehicle2.drive();
    }
}
