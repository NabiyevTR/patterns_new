package patterns.command.console;

import lombok.SneakyThrows;
import patterns.command.FileManager;
import patterns.command.cmds.Command;
import patterns.command.cmds.CommandRegistry;
import patterns.command.cmds.CreateDirectory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    private FileManager fileManager;

    private final static String EXIT = "exit";

    @SneakyThrows
    public void run() {
        fileManager = FileManager.getInstance();
        String input = "";
        String command = "";
        String commandArg = "";

        while (!command.equals(EXIT)) {
            showMenu();
            input = readCommand();
            command = input.split(" ", 2)[0];
            commandArg = input.split(" ", 2)[1];


            if (command.equals(CommandRegistry.CREATE_DIRECTORY.getCmd())) {
                Command cmd = new CreateDirectory(commandArg);
                cmd.execute();
            }

            // Other commands


        }

    }


    public void showMenu() {
        System.out.println();
        System.out.println("FileManager 1.0");
        System.out.println("Current dir: " + fileManager.getCurrentDir());

        for (CommandRegistry command : CommandRegistry.values()) {
            System.out.println(command.getCmd() + " - " + command.getDescription());
        }
        System.out.println("Exit: " + " - " + EXIT);
        System.out.println();
    }

    public String readCommand() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine().trim().toLowerCase();
        }
    }

}
