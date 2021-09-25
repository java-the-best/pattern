package pattern.proxy;

import pattern.Main;
import pattern.proxy.n1Proxy.ProxyReader;
import pattern.proxy.n1Proxy.Reader;
import pattern.proxy.n2Proxy.ReaderInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyMain {

    public static void main() {
//        Reader reader = new ProxyReader();
//        reader.read("hello");

        InvocationHandler invocationHandler = new ReaderInvocationHandler();
        Object proxyInstance = Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{Reader.class}, invocationHandler);
        ((Reader) proxyInstance).read("hello");
    }
}
