/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // if(head == null){
        //     return null;
        // }

        // Map<Node, Node> map = new HashMap<>();

        // Node curr = head;

        // while(curr != null){
        //     map.put(curr, new Node(curr.val));
        //     curr= curr.next;
        // }

        // curr = head;
        // while(curr != null){
        //     Node copy = map.get(curr);
        //     copy.next = map.get(curr.next);
        //     copy.random = map.get(curr.random);

        //     curr = curr.next;
        // }

        // return map.get(head);

        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp != null) {
            Node cloneNode = new Node(temp.val);
            cloneNode.next = temp.next;
            temp.next = cloneNode;
            temp = cloneNode.next;
        }

        temp = head;
        while (temp != null) {
            Node oldNode = temp;
            Node newNode = temp.next;

            if (oldNode.random != null) {
                newNode.random = oldNode.random.next;
            }

            temp = newNode.next;
        }

        temp = head;
        Node ansListHead = head.next;

        while (temp != null) {
            Node oldNode = temp;
            Node cloneNode = temp.next;

            oldNode.next = cloneNode.next;
            if (cloneNode.next != null) {
                cloneNode.next = cloneNode.next.next;
            }
            temp = temp.next;
        }
        return ansListHead;

    }
}