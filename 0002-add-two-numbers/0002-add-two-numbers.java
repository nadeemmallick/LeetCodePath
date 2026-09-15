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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carray = 0;

        ListNode ansHead = new ListNode(-1);
        ListNode ansTail = ansHead;

        while (l1 != null || l2 != null || carray != 0) {
            int sum = 0;

            //checking id l1 is null
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            //Checking if l2 is not null
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            sum = sum + carray;
            //take out the digit
            int digit = sum % 10;

            // create a new node and add it with dummy node
            ListNode newNode = new ListNode(digit);
            ansTail.next = newNode;
            ansTail = newNode;

            carray = sum / 10;
        }

        //remove the dummy node
        ansHead = ansHead.next;

        return ansHead;

    }
}