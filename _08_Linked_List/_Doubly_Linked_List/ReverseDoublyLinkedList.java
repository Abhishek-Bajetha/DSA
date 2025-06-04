package _08_Linked_List._Doubly_Linked_List;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class ReverseDoublyLinkedList {
    public static Node reverseDoublyLinkedListNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head, last = null;
        while (current != null) {
            last = current.back;
            current.back = current.next;
            current.next = last;
            current = current.back;
        }
        return last.back; // because current is now null and last is 2nd last element.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Node head = ArrayToDoublyLinkedList.arrayToDLL(arr);
        ArrayToDoublyLinkedList.display(head);
        head = reverseDoublyLinkedListNode(head);
        ArrayToDoublyLinkedList.display(head);
    }
}
