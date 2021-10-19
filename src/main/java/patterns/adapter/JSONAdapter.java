package patterns.adapter;

import org.json.JSONObject;
import org.json.XML;

public class JSONAdapter implements JSONService {

    private XMLService xmlService;

    public JSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public JSONObject getEurRubRates() {
       return XML.toJSONObject(xmlService.getEurRubRates());
    }

    @Override
    public JSONObject getUsdRubRates() {
        return XML.toJSONObject(xmlService.getUsdRubRates());
    }
}
