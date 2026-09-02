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
    public ListNode removeNodes(ListNode head) {

        //reverse krr dia phele 8->3->13->2->5
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        head = prev;

        //abb right side mai jo small ho ga usko remove krr de ga max head ko mann krr

        int max = head.val;
        curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.val < max) {
                //remove krr do agle wala element
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.val;
            }
        }

        //wapis reverse krr do
        prev = null;
        curr = head;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}