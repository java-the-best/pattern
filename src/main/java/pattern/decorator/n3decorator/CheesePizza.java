package pattern.decorator.n3decorator;

public class CheesePizza implements Pizza {
    public Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " cheese";
    }
}
