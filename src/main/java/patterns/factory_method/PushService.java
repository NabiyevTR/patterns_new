package patterns.factory_method;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class PushService {

    abstract String createMessage(TdeDocument doc);
    abstract void send(TdeDocument doc);
}
