package patterns.command.cmds;

public class CreateDirectory extends Command {

    private String newDirRelPath;

    public CreateDirectory(String newDirRelPath) {
        this.newDirRelPath = newDirRelPath;
    }

    @Override
    public void execute() {
        fileManager.crateDir(newDirRelPath);
    }
}
