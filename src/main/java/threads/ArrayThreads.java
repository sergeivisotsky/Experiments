package threads;

class ArrayCreationAndOutputThread implements Runnable {
    private Thread thread;
    private String name;

    ArrayCreationAndOutputThread(String name) {
        this.name = name;
    }

    private int[] array = new int[10];

    public void start() {
        System.out.println("\nArray creation thread started");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i;
        }

        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("\nArray output started");
            for (int element : array) {
                System.out.print(element + "\t");
            }
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + "interrupted");
        }
    }
}

public class ArrayThreads {
    public static void main(String[] args) {
        var arrayThreadFirst =
                new ArrayCreationAndOutputThread("ArrThread-1");
        arrayThreadFirst.start();
        var arrayThreadSecond =
                new ArrayCreationAndOutputThread("ArrThread-2");
        arrayThreadSecond.start();
    }
}
