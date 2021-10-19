package patterns.singleton;

import lombok.SneakyThrows;
import lombok.ToString;

import java.util.Random;

@ToString
public class AppConfiguration {

    @ToString.Exclude
    private static AppConfiguration instance;

    private int timeOut;
    private int userID;

    @SneakyThrows
    private AppConfiguration() {
        System.out.println("Loading configs from server...");
        Thread.sleep(2000);
        timeOut = new Random().nextInt(1000);
        userID = new Random().nextInt(Integer.MAX_VALUE);
    }

    public static AppConfiguration getConfig() {
        if (instance == null) {
            instance = new AppConfiguration();
        }
        return instance;
    }
}
