package pattern.chainOfResponsibility.n4ChainOfResponsibility;

public class MessageVerifyHandler extends MessageHandler {

    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(String message) {
        if (!message.matches(".*\\d.*")) {
            System.out.println(message);
        }
    }
}
