package pattern.adapter.adapter;

public class SimpleAmericanSocketImpl implements AmericanSocket {

    @Override
    public void getPower() {
        System.out.println("get 100 volt");
    }
}
