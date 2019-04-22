package org.sergei.investigation.country.list;

public class Country {
    private String countryCode;
    private String countryName;

    public Country(String countryCode,
                   String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
