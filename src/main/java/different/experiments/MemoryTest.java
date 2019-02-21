package different.experiments;

/**
 * Memory performance test
 * Loop which reserves memory 1 mb 100 000 times
 */

public class MemoryTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            byte[] arr = new byte[1024 * 1024];
        }
    }
}
