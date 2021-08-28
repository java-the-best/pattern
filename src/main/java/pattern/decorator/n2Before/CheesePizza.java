package pattern.decorator.n2Before;

public class CheesePizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("with cheese");
    }
}
