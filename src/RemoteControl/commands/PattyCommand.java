package RemoteControl.commands;

import RemoteControl.elements.Stereo;

// Macro command
public class PattyCommand implements Command {
    Command[] commands;

    public PattyCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
