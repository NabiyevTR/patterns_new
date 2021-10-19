package patterns.command;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FileManager {

    private static FileManager instance;

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }


    private Path currentDir = Paths.get(System.getenv("SystemDrive"));

    private List<Path> filesInCurrentDir = new ArrayList<>();


    public List<Path> getFilesAndDirs() throws IOException {

        return Files.walk(currentDir)
                .collect(Collectors.toList());
    }

    public boolean changeDir(String path) throws IOException {
        try {
            currentDir = Paths.get(path).normalize();
            filesInCurrentDir = getFilesAndDirs();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean crateDir(String newDirRelPath) {
        Path path = Paths.get(currentDir.toString(), newDirRelPath);
        File newDir = new File(path.toString());
        if (!newDir.exists()) {
            newDir.mkdirs();
            return true;
        }
        return false;
    }

    public boolean changeDirUp() {
        try {
            currentDir = Paths.get(currentDir.toString(), "/../").normalize();
            filesInCurrentDir = getFilesAndDirs();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getCurrentDir() {
        return currentDir.toString();
    }

    public String getFiles() {
        return filesInCurrentDir.stream()
                .filter(Files::isRegularFile)
                .map(f -> f.getFileName().toString())
                .collect(Collectors.joining("\n"));

    }

    public String getFilesAndDir() {
        return filesInCurrentDir.stream()
                .map(f -> f.getFileName().toString())
                .collect(Collectors.joining("\n"));
    }

    public String getFilesWithSize() {
        return filesInCurrentDir.stream()
                .filter(Files::isRegularFile)
                .map(f -> {
                    try {
                        return f.getFileName().toString() + "Size: " + Files.size(f);
                    } catch (IOException e) {
                        return "";
                    }
                })
                .collect(Collectors.joining("\n"));
    }

    public String getFilesAndDirWithSize() {
        return filesInCurrentDir.stream()
                .map(f -> {
                    try {
                        return f.getFileName().toString() + "Size: " + Files.size(f);
                    } catch (IOException e) {
                        return "";
                    }
                })
                .collect(Collectors.joining("\n"));
    }


}


