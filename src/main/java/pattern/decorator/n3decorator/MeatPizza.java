package pattern.decorator.n3decorator;

public class MeatPizza implements Pizza {
    public Pizza pizza;

    public MeatPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " meat";
    }
}
