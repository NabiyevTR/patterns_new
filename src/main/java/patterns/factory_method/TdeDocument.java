package patterns.factory_method;

import lombok.Data;
import org.springframework.util.MultiValueMap;

@Data
public class TdeDocument {
    private String id;
    private String db_name;
    private String date;
    private String title;
    private String content;
    private MultiValueMap<String, String> properties;
}
