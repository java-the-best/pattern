package pattern.facade.n2Before;

public abstract class Room {
    Tv tv = new Tv();
    AirConditioning airConditioning = new AirConditioning();
    Light light = new Light();

    abstract void pressButton(String channel, String temperature);
}
