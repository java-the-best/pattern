package pattern.command.command;

public class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
