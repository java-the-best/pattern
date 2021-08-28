package pattern.decorator.n3decorator;

public class PepperoniPizza implements Pizza {
    public Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " pepperoni";
    }
}
