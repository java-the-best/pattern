package pattern.chainOfResponsibility;

import pattern.chainOfResponsibility.n4ChainOfResponsibility.MessageAddExclamationMarkHandler;
import pattern.chainOfResponsibility.n4ChainOfResponsibility.MessageHandler;
import pattern.chainOfResponsibility.n4ChainOfResponsibility.MessagePrintHandler;
import pattern.chainOfResponsibility.n4ChainOfResponsibility.MessageVerifyHandler;

public class ChainOfResponsibilityMain {

    public static void main() {
        MessageHandler messageHandler = new MessageAddExclamationMarkHandler(
                new MessageVerifyHandler(new MessagePrintHandler(null)));
        messageHandler.handle("hello world");
    }
}
