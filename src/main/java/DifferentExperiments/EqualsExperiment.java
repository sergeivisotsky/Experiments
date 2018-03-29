package DifferentExperiments;

class Exp {
    private double dev, test;

    public Exp(double dev, double test) {
        this.dev = dev;
        this.test = test;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Exp)) {
            return false;
        }

        Exp cool = (Exp) obj;
        return Double.compare(dev, cool.dev) == 0
                && Double.compare(test, cool.test) == 0;
    }
}

public class EqualsExperiment {
    public static void main(String[] args) {
        Exp obj1 = new Exp(15, 5);
        Exp obj2 = new Exp(15, 5);
        if (obj1.equals(obj2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
