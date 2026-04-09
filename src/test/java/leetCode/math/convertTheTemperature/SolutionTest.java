package leetCode.math.convertTheTemperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        double[] output = {309.65, 97.7};
        assertArrayEquals(output, solution.convertTemperature(36.50));
    }

    @Test
    void test2() {
        double[] output = {395.26000, 251.79800};
        assertArrayEquals(output, solution.convertTemperature(122.11));
    }
}