package pattern.facade.n1Before;

public class BadRoom {

    public void pressButton(String channel, String temperature) {
        Tv tv = new Tv();
        tv.playChannel(channel);

        AirConditioning airConditioning = new AirConditioning();
        airConditioning.setTemperature(temperature);

        Light light = new Light();
        light.turnLight();
    }
}
