package pattern.decorator.n2Before;

public class PepperoniPizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("with pepperoni");
    }
}
