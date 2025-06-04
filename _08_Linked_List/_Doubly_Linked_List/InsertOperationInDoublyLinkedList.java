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

public class InsertOperationInDoublyLinkedList {
    public static Node insertBeforeHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head.back = newNode;
        return newNode;
    }

    public static Node insertBeforeTail(Node head, int val) {
        if (head.next == null) {
            return insertBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newNode = new Node(val);
        Node prev = tail.back;
        newNode.next = tail;
        newNode.back = prev;

        prev.next = newNode;
        tail.back = newNode;
        return head;
    }

    public static Node insertBeforeKthNode(Node head, int k, int val) {
        if (k == 1)
            return insertBeforeHead(head, val);
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val);

        newNode.next = temp;
        newNode.back = prev;
        
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = ArrayToDoublyLinkedList.arrayToDLL(arr);
        ArrayToDoublyLinkedList.display(head);
        head = insertBeforeHead(head, 100);
        ArrayToDoublyLinkedList.display(head);
        head = insertBeforeTail(head, 200);
        ArrayToDoublyLinkedList.display(head);
        head = insertBeforeKthNode(head,3, 300);
        ArrayToDoublyLinkedList.display(head);
    }
}
