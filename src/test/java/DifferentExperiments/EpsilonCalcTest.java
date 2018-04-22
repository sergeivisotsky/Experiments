package DifferentExperiments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpsilonCalcTest {

    private double insertionForTest() {
        int quantity = 3;
        double result = 0;
        for (int i = 0; i < quantity; i++) {
            result = EpsilonCalc.average(3, 2);
        }
        return result;
    }

    @Test
    void averageTest() {
        assertEquals(4, insertionForTest());
    }

    @Test
    void epsilonTest() {
        assertEquals(7.6923076923076925,
                EpsilonCalc.epsilon(12, 156));
    }
}