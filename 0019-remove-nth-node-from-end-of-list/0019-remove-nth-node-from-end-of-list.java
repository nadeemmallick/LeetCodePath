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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Length niklo
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        //invalid hai to 
        if (n == length) {
            return head.next;
        }

        int position = length - n - 1;

        temp = head;

        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;

    }
}