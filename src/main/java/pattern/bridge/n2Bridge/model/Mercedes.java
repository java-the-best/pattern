package pattern.bridge.n2Bridge.model;

public class Mercedes implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + " mercedes");
    }
}
