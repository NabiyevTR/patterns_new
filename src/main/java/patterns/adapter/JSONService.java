package patterns.adapter;

import org.json.JSONObject;

public interface JSONService {

    JSONObject getEurRubRates();

    JSONObject getUsdRubRates();

}
