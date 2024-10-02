package leetCode.math.SubtractProductAndSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractProductAndSumTest {
    @Test
    public void test1() {
        assertEquals(15, SubtractProductAndSum.subtractProductAndSum(234));
    }

    @Test
    public void test2() {
        assertEquals(21, SubtractProductAndSum.subtractProductAndSum(4421));
    }
}