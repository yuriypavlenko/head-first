package RemoteControl.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No commands executed");
    }

    @Override
    public void undo() {
        System.out.println("Nothing to undo");
    }
}
