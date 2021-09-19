package pattern.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Chat {
    List<Colegue> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Colegue me) {
        list.forEach(colegue -> {
            if (colegue != me) {
                colegue.printMessage(message);
            }});
    }

    @Override
    public void addColegue(Colegue colegue) {
        list.add(colegue);
    }
}
