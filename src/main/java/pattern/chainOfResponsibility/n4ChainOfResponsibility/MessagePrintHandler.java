package pattern.chainOfResponsibility.n4ChainOfResponsibility;

public class MessagePrintHandler extends MessageHandler {

    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(String message) {
        System.out.println(message);
    }
}
