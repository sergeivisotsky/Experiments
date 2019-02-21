package different.experiments;

public class lambdaExpressions {
    public static void execution(Runnable runnable) {
        System.out.println("Hello space!");
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        execution(() -> System.out.println("Hello bro!!!"));
    }
}
