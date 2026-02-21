package leetCode.linkedList.removeDuplicates;

/**
 * 83. Remove Duplicates from Sorted List
 * <p>
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1910492959/">Submission link</a>
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}