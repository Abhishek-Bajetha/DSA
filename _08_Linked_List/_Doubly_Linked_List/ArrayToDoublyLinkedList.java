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

public class ArrayToDoublyLinkedList {
    public static Node arrayToDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            prev.next = newNode;
            newNode.back = prev;
            prev = prev.next;
        }
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        Node head = arrayToDLL(arr);
        display(head);
    }
}
