package leetCode.linkedList.reverseLinkedList;

/**
 * 206. Reverse Linked List
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * <a href="https://leetcode.com/problems/reverse-linked-list/submissions/1917318435/">Submission link</a>
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}