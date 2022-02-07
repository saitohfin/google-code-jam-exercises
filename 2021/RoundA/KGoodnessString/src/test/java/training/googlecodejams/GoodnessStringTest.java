package training.googlecodejams;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodnessStringTest {

    private GoodnessString goodnessString;

    @BeforeEach
    public void setUp() {
        this.goodnessString = new GoodnessString();
    }

    @Test
    public void case1() {
        final Integer expected = 0;
        final String input = "ABCAA";
        final Integer score = 1;
        final Integer result = goodnessString.minimalTransformationsForScore(input, score);
        assertEquals(expected, result);
    }

    @Test
    public void case2() {
        final Integer expected = 1;
        final String input = "ABAA";
        final Integer score = 2;
        final Integer result = goodnessString.minimalTransformationsForScore(input, score);
        assertEquals(expected, result);
    }
}
