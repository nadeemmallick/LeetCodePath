/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Phase 1 cycle detect;
        // ListNode slow = head;
        // ListNode fast = head;

        // while(fast != null && fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if(slow == fast){
        //         break;
        //     }
        // }

        // //cycle not present
        // if(fast == null || fast.next== null){
        //     return null;
        // }

        // slow = head;

        // while(slow!=fast){
        //     slow = slow.next;
        //     fast = fast.next;
        // }

        // return slow;

        HashSet<ListNode> visited = new HashSet<>();

        ListNode curr = head;

        while (curr != null) {

            // Agar node pehle visit ho chuki hai
            if (visited.contains(curr)) {
                return curr;
            }

            // First time visit
            visited.add(curr);

            curr = curr.next;
        }

        // No cycle
        return null;

    }
}