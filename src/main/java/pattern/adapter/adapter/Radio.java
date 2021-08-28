package pattern.adapter.adapter;

public class Radio {

    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}
