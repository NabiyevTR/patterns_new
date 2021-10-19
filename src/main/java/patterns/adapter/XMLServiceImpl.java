package patterns.adapter;

public class XMLServiceImpl implements XMLService{

    private String eurRubRates;
    private String usdRubRates;

    @Override
    public String getEurRubRates() {
        return eurRubRates;
    }

    @Override
    public String getUsdRubRates() {
        return usdRubRates;
    }

    @Override
    public void setEurRubRates(String eurRubRates) {
        this.eurRubRates = eurRubRates;
    }

    @Override
    public void setUsdRubRates(String usdRubRates) {
        this.usdRubRates = usdRubRates;
    }
}
