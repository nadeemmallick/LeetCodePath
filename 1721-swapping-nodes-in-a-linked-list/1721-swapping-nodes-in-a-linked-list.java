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
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        int position = length - k + 1;
        ListNode curr = head;

        for (int i = 1; i < position; i++) {
            curr = curr.next;
        }

        // values swap
        int value = temp.val;
        temp.val = curr.val;
        curr.val = value;

        return head;

    }
}