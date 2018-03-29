package DifferentExperiments;

class Developer {
    private String name;
    private String surname;
    private int age;

    public Developer(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}

public class HashCodeExperiment {
    public static void main(String[] args) {
        Developer developer =
                new Developer("John", "Kensington", 23);
        System.out.println(developer.hashCode());
    }
}
