package leetCode.string.numberOfSeniorCitizens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        String[] details = new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        assertEquals(2, solution.countSeniors(details));
    }

    @Test
    void test2() {
        String[] details = new String[]{"1313579440F2036", "2921522980M5644"};
        assertEquals(0, solution.countSeniors(details));
    }
}