package different.experiments;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EpsilonCalcTest {

    private double insertionForTest() throws IOException {
        int quantity = 3;
        double result = 0;
        for (int i = 0; i < quantity; i++) {
            result = EpsilonCalc.average(3);
        }
        return result;
    }

    @Test
    void averageTest() throws IOException {
        assertEquals(4, insertionForTest());
    }

    @Test
    void epsilonTest() {
        assertEquals(7.6923076923076925,
                EpsilonCalc.epsilon(12, 156));
    }
}