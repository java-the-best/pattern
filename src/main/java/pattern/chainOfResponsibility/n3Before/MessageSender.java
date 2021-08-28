package pattern.chainOfResponsibility.n3Before;

public class MessageSender {
    MessagePrinter messagePrinter;

    public MessageSender(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void sendMessage(String message) {
        messagePrinter.printMessage(message);
    }
}
