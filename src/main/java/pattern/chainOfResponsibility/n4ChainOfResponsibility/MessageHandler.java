package pattern.chainOfResponsibility.n4ChainOfResponsibility;

public abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public abstract void handle(String message);
}
