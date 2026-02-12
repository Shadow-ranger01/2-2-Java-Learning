public class ReverseList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // 1. Save the rest of the list
            curr.next = prev; // 2. Flip the pointer (the actual reversal)
            
            // 3. Move pointers forward for the next iteration
            prev = curr;
            curr = next;
        }
        
        // At the end, prev will be the new head
        return prev;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}
