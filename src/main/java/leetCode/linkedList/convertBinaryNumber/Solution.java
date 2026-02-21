package leetCode.linkedList.convertBinaryNumber;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * <p>
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/1906519775/">Submission link</a>
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.val);
            current = current.next;
        }
        System.out.println(sb);
        int decimal = Integer.parseInt(sb.toString(), 2);

        return decimal;
    }
}