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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode oddH = null;
        ListNode oddT = null;

        ListNode evenH = null;
        ListNode evenT = null;

        ListNode curr = head;
        int position = 1;

        while (curr != null) {

            ListNode newNode = new ListNode(curr.val);

            if (position % 2 == 1) {

                // Odd position
                if (oddH == null) {
                    oddH = newNode;
                    oddT = newNode;
                } else {
                    oddT.next = newNode;
                    oddT = newNode;
                }

            } else {

                // Even position
                if (evenH == null) {
                    evenH = newNode;
                    evenT = newNode;
                } else {
                    evenT.next = newNode;
                    evenT = newNode;
                }
            }

            position++;
            curr = curr.next;
        }

        // Odd list + Even list
        oddT.next = evenH;

        return oddH;
    }

}