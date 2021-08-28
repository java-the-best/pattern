package pattern.chainOfResponsibility.n2Before;

public class MessageSender {
    MessagePrinter messagePrinter;

    public MessageSender(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void sendMessage(String message) {
        messagePrinter.printMessage(message);
    }
}
