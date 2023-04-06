package patterns.factory_method;

public class Main {

    public static void main(String[] args) {
        TdeDocument doc = new TdeDocument();
        // Factory method
        PushService pushService = getPushService(args);
        pushService.send(doc);
    }

    private static PushService getPushService(String[] args) {
        if (args == null || args.length == 0) {
            throw new  IllegalStateException("no args");
        }
        String service = args[0].trim();
        if (service.equalsIgnoreCase("solr")) {
            return new SolrPushService();
        } else if (service.equalsIgnoreCase("idol")) {
            return new IdolPushService();
        }
        throw new IllegalStateException("wrong push service type");
    }
}
