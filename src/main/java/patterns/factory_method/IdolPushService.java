package patterns.factory_method;

public class IdolPushService extends PushService{

    @Override
    String createMessage(TdeDocument doc) {
        // create Idol message
        return null;
    }

    @Override
    void send(TdeDocument doc) {
        // send to Idol
    }
}
