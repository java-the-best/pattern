package pattern.command.command;

public class PhoneCommand implements Command {
    private Phone phone;
    private String name;

    public PhoneCommand(Phone phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public void execute() {
        phone.makeCall(name);
    }
}
