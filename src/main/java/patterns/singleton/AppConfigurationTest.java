package patterns.singleton;

public class AppConfigurationTest {
    public static void main(String[] args) {

        System.out.println("Getting configs first time:");
        AppConfiguration configs = AppConfiguration.getConfig();
        System.out.println(configs);

        System.out.println("Getting configs second time:");
        configs = AppConfiguration.getConfig();
        System.out.println(configs);

    }
}
