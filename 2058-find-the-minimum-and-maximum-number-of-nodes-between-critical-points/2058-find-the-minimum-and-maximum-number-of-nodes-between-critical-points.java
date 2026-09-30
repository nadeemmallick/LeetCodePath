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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null) {
            return new int[] { -1, -1 };
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1; // index follow up
        List<Integer> criticalpoint = new ArrayList<>(); //critical points store krr RAHE HAI

        while (curr != null && curr.next != null) {
            //maximal critical point
            if (curr.val > prev.val && curr.val > curr.next.val) {
                criticalpoint.add(i);
            }

            //minimal critical point
            if (curr.val < prev.val && curr.val < curr.next.val) {
                criticalpoint.add(i);
            }

            curr = curr.next;
            prev = prev.next;
            i = i + 1;
        }

        if (criticalpoint.size() < 2) {
            return new int[] { -1, -1 };
        }
        //mindistaance b=nikal rahe hai issme 
        int minDist = Integer.MAX_VALUE;
        for (int j = 1; j < criticalpoint.size(); j++) {
            minDist = Math.min(minDist, criticalpoint.get(j) - criticalpoint.get(j - 1));
        }
        //max distance nikal rah ehai
        int maxDist = criticalpoint.get(criticalpoint.size() - 1) - criticalpoint.get(0);

        return new int[] { minDist, maxDist };

    }
}