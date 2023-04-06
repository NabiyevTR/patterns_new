package patterns.adapter;

public class TestAdapter {

    public static String XML_EUR_RUB_RATES =
            "<?xml version=\"1.0\" ?><rates date=\"2021.09.10\" time=\"12:23\" rate=\"44.34\"/>";
    public static String XML_USD_RUB_RATES =
            "<?xml version=\"1.0\" ?><rates date=\"2021.09.10\" time=\"14:33\" rate=\"32.21\"/>";


    public static void main(String[] args) {

        XMLService xmlService = new XMLServiceImpl();
        xmlService.setEurRubRates(XML_EUR_RUB_RATES);
        xmlService.setUsdRubRates(XML_USD_RUB_RATES);

        JSONService jsonService = new JSONAdapter(xmlService);

        System.out.println(xmlService.getEurRubRates().toString());

        System.out.println("EUR - RUB rates:");
        System.out.println(jsonService.getEurRubRates().toString(4));

        System.out.println("USD - RUB rates:");
        System.out.println(jsonService.getUsdRubRates().toString(4));
    }
}
