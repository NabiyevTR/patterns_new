package patterns.factory_method;

import org.springframework.stereotype.Service;

@Service
public class SolrPushService  extends PushService{

    @Override
    String createMessage(TdeDocument doc) {
        // Create Solr message
        return null;
    }

    @Override
    void send(TdeDocument doc) {
        // Send doc to Solr
    }
}
