package pattern.decorator.n1Before;

public class CheesePepperoniPizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("with cheese pepperoni");
    }
}
