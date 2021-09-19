package pattern.mediator.mediator;

public class ColegueImpl extends Colegue {

    public ColegueImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public
    void printMessage(String message) {
        System.out.println(name + ": " + message);
    }
}
