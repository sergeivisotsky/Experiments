package different.experiments;

public class SubClasses {
    public static void main(String[] args) {
        SubClass subClassObject = new SubClass() {


            public void createSmth(int s) {
                doSmth(56, 89);
            }
        };

        subClassObject.doSmth(56, 67);
    }
}

class SubClass {
    public static int doSmth(int a, int b) {
        int s = a * b;
        System.out.print(s);
        return s;
    }
}