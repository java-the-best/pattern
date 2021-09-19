package pattern.mediator;

import pattern.mediator.mediator.Chat;
import pattern.mediator.mediator.ChatMediator;
import pattern.mediator.mediator.Colegue;
import pattern.mediator.mediator.ColegueImpl;

public class MediatorMain {

    public static void main() {
        Chat chat = new ChatMediator();
        Colegue mike = new ColegueImpl(chat, "Mike");
        chat.addColegue(mike);
        chat.addColegue(new ColegueImpl(chat, "Den"));
        chat.addColegue(new ColegueImpl(chat, "Kent"));
        mike.sendMessage("hello world");
    }
}
