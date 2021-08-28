package pattern.decorator.n2Before;

public class MakePizza implements Pizza {
    boolean pepperony;
    boolean cheese;
//    ...

    @Override
    public void makePizza() {
        System.out.println("with " + (pepperony ? "pepperony " : "") + (cheese ? "cheese " : "") /* ... */ );
    }
}
