package leetCode.heap.kthLargestElementInStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {
    @Test
    void test1() {
        int k = 3;
        int[] nums = {4, 5, 8, 2};

        KthLargest kthLargest = new KthLargest(k, nums);
        assertEquals(4, kthLargest.add(3), "После добавления 3 должен вернуться 4");
        assertEquals(5, kthLargest.add(5), "После добавления 5 должен вернуться 5");
        assertEquals(5, kthLargest.add(10), "После добавления 10 должен вернуться 5");
        assertEquals(8, kthLargest.add(9), "После добавления 9 должен вернуться 8");
        assertEquals(8, kthLargest.add(4), "После добавления 4 должен вернуться 8");
    }
}