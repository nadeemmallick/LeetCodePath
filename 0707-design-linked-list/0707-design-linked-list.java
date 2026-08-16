class MyLinkedList {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // First node
    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;
        int count = 0;

        while (temp != null) {

            if (count == index) {
                return temp.val;
            }

            temp = temp.next;
            count++;
        }

        return -1;

    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;

    }

    public void addAtIndex(int index, int val) {
        // If index is 0
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;
        int count = 0;

        // Reach node just before index
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        // Index is invalid
        if (temp == null) {
            return;
        }

        Node newNode = new Node(val);

        // Connect new node
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtIndex(int index) {

        // Empty list
        if (head == null) {
            return;
        }

        // Delete first node
        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 0;

        // Reach node just before index
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        // Invalid index
        if (temp == null || temp.next == null) {
            return;
        }

        // Delete node
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */