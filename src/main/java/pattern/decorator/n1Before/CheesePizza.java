package pattern.decorator.n1Before;

public class CheesePizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("with cheese");
    }
}
