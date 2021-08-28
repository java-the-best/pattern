package pattern.facade.n3Facade;

public class RoomFacade {
    Tv tv = new Tv();
    AirConditioning airConditioning = new AirConditioning();
    Light light = new Light();

    public void pressButton(String channel, String temperature) {
        tv.playChannel(channel);
        airConditioning.setTemperature(temperature);
        light.turnLight();
    }
}
