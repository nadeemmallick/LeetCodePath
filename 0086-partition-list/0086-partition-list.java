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
        //we create to dummy list one lesser which store lesser value then x
        //second dummy list store all greater and equal to node 

        ListNode lesserH = new ListNode(-1);
        ListNode lesserT = lesserH;

        ListNode greaterH = new ListNode(-1);
        ListNode greaterT = greaterH;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                //to hum ek insertnode baniye gai jo temp ke data ko store kare ga kyu aise le gai to temp humra lost ho jiye ga

                ListNode InsertNode = temp;
                temp = temp.next;
                lesserT.next = InsertNode;
                lesserT = InsertNode;
            } else {
                ListNode InsertNode = temp;
                temp = temp.next;
                greaterT.next = InsertNode;
                greaterT = InsertNode;

            }
        }

        //partition ka kam ho gya abb sab ko add krna hai to
        lesserT.next = greaterH.next;
        greaterT.next = null;
        lesserH = lesserH.next;

        return lesserH;

    }
}