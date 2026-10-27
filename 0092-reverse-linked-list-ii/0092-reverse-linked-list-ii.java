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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        ListNode prev= dummy;
        dummy.next = head; 
         // Step 1: Reach the node before left
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
      // Step 2: Start of the section
        ListNode curr = prev.next;
         // Step 3: Reverse the section
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }
}