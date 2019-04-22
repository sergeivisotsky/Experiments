package org.sergei.investigation.experiments;

import java.util.Locale;

public class ListOfCountries {
    public static void main(String[] args) {
        ListOfCountries start = new ListOfCountries();
        start.run();
    }

    private void run() {
        int lineNumber = 1;
        String[] locales = Locale.getISOCountries();
        for (String countryCode: locales) {
            Locale obj = new Locale("", countryCode);
            System.out.println(lineNumber++ + ". " +
                    "Country Code: " + obj.getCountry() + " " +
                    "Country Name: " + obj.getDisplayCountry());
        }
        System.out.println("Done");
    }
}
