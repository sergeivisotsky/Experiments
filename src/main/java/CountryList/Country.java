package CountryList;

import java.util.List;

public class Country {
    private String name;
    private String language;

    public Country(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + name +
                ", language=" + language +
                '}';
    }
}
