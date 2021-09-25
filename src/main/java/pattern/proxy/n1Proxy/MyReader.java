package pattern.proxy.n1Proxy;

public class MyReader implements Reader {

    @Override
    public String read(String str) {
        return str + " world";
    }
}
