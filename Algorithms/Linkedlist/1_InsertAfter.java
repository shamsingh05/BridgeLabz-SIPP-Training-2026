class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertAfter {

    public static void insertAfter(Node current, int value) {
        if (current == null) {
            return;
        }

        Node newNode = new Node(value);

        newNode.next = current.next;
        current.next = newNode;
    }
}
