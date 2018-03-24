import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarbageCollection {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory before: " + runtime.totalMemory());
        System.out.println("Free memory before: " + runtime.freeMemory());
        List<Date> dateList = new ArrayList<>(1_000_000_00);
        for (int i = 0; i < 1_000_000_00; i++) {
            Date date = new Date();
            dateList.add(date);
//            date = null;
        }
//        System.out.print(dateList);

        System.out.println("Total memory before: " + runtime.totalMemory());
        System.out.println("Free memory before: " + runtime.freeMemory());
        System.gc();
        System.out.println("Total memory before gc: " + runtime.totalMemory());
        System.out.println("Free memory before gc: " + runtime.freeMemory());
    }
}
