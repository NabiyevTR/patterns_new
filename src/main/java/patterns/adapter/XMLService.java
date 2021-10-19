package patterns.adapter;

public interface XMLService {

    String getEurRubRates();

    String getUsdRubRates();

    void setEurRubRates(String eurRubRates);

    void setUsdRubRates(String usdRubRates);
}
