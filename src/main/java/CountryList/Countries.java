package CountryList;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class InitializeCountry {
    private List<String> countriesNames = Arrays.asList(Locale.getISOCountries());
    private List<String> languages = Arrays.asList(Locale.getISOLanguages());

    public void writeData() {
        for (String countryName : countriesNames) {
            for (String language : languages) {
                Country country = new Country(countryName, language);
                System.out.println(country);
            }
        }
    }
}

public class Countries {

    public static void main(String[] args) {
        InitializeCountry getCountries = new InitializeCountry();
        getCountries.writeData();
    }
}
