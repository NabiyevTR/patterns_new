package patterns.command.cmds;

public class MoveUp extends Command {
    @Override
    public void execute() {
        fileManager.changeDirUp();
    }
}
