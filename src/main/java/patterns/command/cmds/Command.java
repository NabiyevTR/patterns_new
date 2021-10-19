package patterns.command.cmds;

import patterns.command.FileManager;

public abstract class Command {

    public FileManager fileManager;

    public abstract void execute();
}
