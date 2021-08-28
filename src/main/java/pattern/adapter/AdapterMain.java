package pattern.adapter;

import pattern.adapter.adapter.*;

public class AdapterMain {

    public static void main() {
        AmericanSocket socket = new SimpleAmericanSocketImpl();
        EuroSocket euroSocket = new SocketAdapter(socket);
        Radio radio = new Radio();
        radio.listenMusic(euroSocket);
    }
}
