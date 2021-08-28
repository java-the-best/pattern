package pattern.chainOfResponsibility.n2Before;

public class MessagePrinter {

    public void printMessage(String message) {
        if (!message.matches(".*\\d.*")) {
            System.out.println(message);
        }
    }
}
