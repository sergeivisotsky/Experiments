package org.sergei.investigation.countries;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class InitializeCountry {
    private List<String> ISOCountries = Arrays.asList(Locale.getISOCountries());

    public void writeData() {
        for (String ISOctrs : ISOCountries) {
            Locale locale = new Locale("", ISOctrs);
            Country country = new Country(
                    locale.getCountry(),
                    locale.getDisplayCountry());
            System.out.println(country);
        }

        System.out.println("\nDone!");
    }
}

public class Countries {

    public static void main(String[] args) {
        InitializeCountry getCountries = new InitializeCountry();
        getCountries.writeData();
    }
}
