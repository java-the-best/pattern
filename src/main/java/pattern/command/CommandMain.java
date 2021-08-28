package pattern.command;

import pattern.command.command.*;

public class CommandMain {

    public static void main() {
        Command command = new LightCommand(new Light());
        Button button = new Button(command);
        button.pressButton();

        command = new MusicPlayerCommand(new MusicPlayer());
        button = new Button(command);
        button.pressButton();

        command = new CoffeeMachineCommand(new CoffeeMachine());
        button = new Button(command);
        button.pressButton();

        command = new LightAndMusicPlayerCommand(new Light(), new MusicPlayer());
        button = new Button(command);
        button.pressButton();

        command = new PhoneCommand(new Phone(), "Иван");
        button = new Button(command);
        button.pressButton();
    }
}
