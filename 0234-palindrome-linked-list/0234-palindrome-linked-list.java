/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For an odd-length list, skip the middle node
        if (fast != null) {
            slow = slow.next;
        }

        // 2. Reverse the second half
        ListNode secondHalf = reverse(slow);

        // 3. Compare both halves
        ListNode firstHalf = head;
        ListNode curr = secondHalf;

        while (curr != null) {
            if (firstHalf.val != curr.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            curr = curr.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}