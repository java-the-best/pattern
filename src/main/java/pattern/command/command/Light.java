package pattern.command.command;

public class Light {
    boolean isOn;

    public void swicthLight() {
        this.isOn = !this.isOn;
        System.out.println("light is " + (isOn ? "on" : "off"));
    }
}
