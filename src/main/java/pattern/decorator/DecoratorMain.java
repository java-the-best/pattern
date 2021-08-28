package pattern.decorator;

import pattern.decorator.n3decorator.*;

public class DecoratorMain {

    public static void main() {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        Pizza pepperoniPizza = new PepperoniPizza(new DoughPizza());
        Pizza meatPizza = new MeatPizza(new DoughPizza());
        Pizza cheesePepperoniPizza = new PepperoniPizza(new CheesePizza(new DoughPizza()));
        Pizza cheesePepperoniMeatPizza = new MeatPizza(new PepperoniPizza(new CheesePizza(new DoughPizza())));

        System.out.println(cheesePizza.makePizza());
        System.out.println(pepperoniPizza.makePizza());
        System.out.println(meatPizza.makePizza());
        System.out.println(cheesePepperoniPizza.makePizza());
        System.out.println(cheesePepperoniMeatPizza.makePizza());
    }
}
