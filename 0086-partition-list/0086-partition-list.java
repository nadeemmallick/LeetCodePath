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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(-1);
        ListNode lessTail = lessHead;

        ListNode greatHead = new ListNode(-1);
        ListNode greatTail = greatHead;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                ListNode InsertIn = temp;
                temp = temp.next;
                lessTail.next = InsertIn;
                lessTail = InsertIn;
            } else {
                ListNode Insertin = temp;
                temp = temp.next;
                greatTail.next = Insertin;
                greatTail = Insertin;
            }
        }

        lessTail.next = greatHead.next;
        greatTail.next = null;
        lessHead = lessHead.next;

        return lessHead;

    }
}