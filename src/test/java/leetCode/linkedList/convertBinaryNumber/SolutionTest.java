package leetCode.linkedList.convertBinaryNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0, new ListNode(1));
        int res = solution.getDecimalValue(head);
        assertEquals(5, res);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(0);
        int res = solution.getDecimalValue(head);
        assertEquals(0, res);
    }
}