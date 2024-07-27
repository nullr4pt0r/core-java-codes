package deepCopy;

public class DeepCopyExample {
    public static void main(String[] args) {
        // Create a list with two nodes
        Node node1 = new Node(10);
        node1.next = new Node(20);

        // Perform a shallow copy
        Node node2 = new Node(node1);

        // Print the original list
        System.out.println("Original list:");
        printList(node1);

        // Print the copied list
        System.out.println("Copied list:");
        printList(node2);

        // Modify the data of the second node in the original list
        node1.next.data = 30;

        // Print both lists again
        System.out.println("Original list after modification:");
        printList(node1);
        System.out.println("Copied list after modification:");
        printList(node2);
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    // Copy constructor for shallow copy
    Node(Node node) {
        this.data = node.data;
        this.next = node.next;
    }
}

/**
 *
 */
class T {

}
