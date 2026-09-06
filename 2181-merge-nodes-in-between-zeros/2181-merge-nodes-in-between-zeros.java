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
    public ListNode mergeNodes(ListNode head) {

        // ListNode ansH = null;
        // ListNode ansT = null;

        // ListNode temp = head.next;
        // int sum = 0;

        // while (temp != null) {
        //     if (temp.val != 0) {
        //         sum = sum + temp.val;
        //     } else {
        //         ListNode newNode = new ListNode(sum);

        //         if (ansH == null) {
        //             ansH = newNode;
        //             ansT = newNode;
        //         } else {
        //             ansT.next = newNode;
        //             ansT = newNode;
        //         }
        //         sum = 0;
        //     }
        //     temp = temp.next;
        // }
        // return ansH;

        ListNode read = head.next;
        ListNode write = head;

        while (read != null) {
            int sum = 0;
            while (read.val != 0) {
                sum = sum + read.val;
                read = read.next;
            }
            write.val = sum;
            write.next = read.next;
            read = read.next;
            write = write.next;
        }
        return head;
    }
}