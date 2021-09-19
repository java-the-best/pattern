package pattern.mediator.mediator;

public abstract class Colegue {

    Chat chat;
    String name;

    public Colegue(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void printMessage(String message);
}
