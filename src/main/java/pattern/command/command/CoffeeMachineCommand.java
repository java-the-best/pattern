package pattern.command.command;

public class CoffeeMachineCommand implements Command {
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.makeCoffee();
    }
}
