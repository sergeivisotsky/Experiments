package DifferentExperiments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpsilonCalcTest {

    @Test
    void epsilonTest() {
        assertEquals(7.6923076923076925,
                EpsilonCalc.epsilon(12, 156));
    }
}