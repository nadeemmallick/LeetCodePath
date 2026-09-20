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
    public ListNode reverseKGroup(ListNode head, int k) {

        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int group = len / k;

        ListNode curr = head;
        ListNode ansH = null;
        ListNode ansT = null;

        while (group > 0) {

            ListNode GH = curr;
            ListNode prev = null;

            for (int i = 0; i < k; i++) {
                ListNode forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }

            if (ansH == null) {
                ansH = prev;
            } else {
                ansT.next = prev;
            }
            ansT = GH;
            group--;
        }
        ansT.next = curr;
        return ansH;

    }
}