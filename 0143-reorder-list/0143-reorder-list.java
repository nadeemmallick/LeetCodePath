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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        // this question solve in 3 steps
        // 1.use slow and fast pointer to obtain middle

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2.reverse the second half

        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        // 3. merge the both list

        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

    }
}