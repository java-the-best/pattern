package pattern.mediator.mediator;

public interface Chat {

    void sendMessage(String message, Colegue me);
    void addColegue(Colegue colegue);
}
