package pattern.proxy.n1Proxy;

public class ProxyReader extends MyReader {

    @Override
    public String read(String str) {
        System.out.println(str);
        String read = super.read(str);
        System.out.println(read);
        return read;
    }
}
