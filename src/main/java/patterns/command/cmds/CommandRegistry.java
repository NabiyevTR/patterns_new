package patterns.command.cmds;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommandRegistry {
    BACK("up", "to parent directory"),
    CREATE_DIRECTORY("mkdir", "create directory"),
    MOVE_UP("up", "to parent directory"),
    ROOT("root", "to root directory");

    private String cmd;
    private String description;

}
