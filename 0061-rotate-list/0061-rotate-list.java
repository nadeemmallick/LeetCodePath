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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;
        ListNode temp = head;

        // length find karo + tail par temp
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // k update karo
        k = k % len;

        // agar rotation ki zarurat nahi
        if (k == 0) {
            return head;
        }

        // circular banao
        temp.next = head;

        // new tail find karo
        temp = head;

        for (int i = 1; i < len - k; i++) {
            temp = temp.next;
        }

        // new head
        ListNode forward = temp.next;

        // cycle break
        temp.next = null;

        return forward;

        // while (k > 0) {
        //     ListNode prev = null;
        //     ListNode curr = head;

        //     while (curr.next != null) {
        //         prev = curr;
        //         curr = curr.next;
        //     }

        //     prev.next = null;
        //     curr.next = head;
        //     head = curr;

        //     k--;
        // }

        // return head;
    }
}