package leetCode.math.fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        List<String> list = List.of("1", "2", "Fizz");
        assertEquals(list, solution.fizzBuzz(3));
    }

    @Test
    void test2() {
        List<String> list = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(list, solution.fizzBuzz(5));
    }

    @Test
    void test3() {
        List<String> list = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(list, solution.fizzBuzz(15));
    }
}