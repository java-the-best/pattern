package pattern.facade.n2Before;

public class BadRoom extends Room {

    public void pressButton(String channel, String temperature) {
        tv.playChannel(channel);
        airConditioning.setTemperature(temperature);
        light.turnLight();
    }
}
