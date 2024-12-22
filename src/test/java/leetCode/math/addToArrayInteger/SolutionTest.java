package leetCode.math.addToArrayInteger;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        int[] num = {1, 2, 0, 0};
        int k = 34;
        assertEquals(result, Solution.addToArrayForm(num, k));
    }

    @Test
    public void test2() {
        List<Integer> result = new ArrayList<>();
        result.add(4);
        result.add(5);
        result.add(5);
        int[] num = {2, 7, 4};
        int k = 181;
        assertEquals(result, Solution.addToArrayForm(num, k));
    }

    @Test
    public void test3() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(0);
        result.add(2);
        result.add(1);
        int[] num = {2, 1, 5};
        int k = 806;
        assertEquals(result, Solution.addToArrayForm(num, k));
    }
}