package _08_Linked_List._1D_Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteOperationInLinkedList {
    public static void displayLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removeHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    public static Node removeTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node removeKthNode(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        Node temp = head, prev = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node removeElementNode(Node head, int element) {
        if (head == null)
            return head;
        if (head.data == element) {
            head = head.next;
            return head;
        }
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.data == element) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        Node n3 = new Node(30);
        n2.next = n3;
        Node n4 = new Node(40);
        n3.next = n4;
        Node n5 = new Node(50);
        n4.next = n5;

        Node head = n1;
        displayLinkedList(head);
        head = removeHead(head); // Delete the head Node of Linked List
        displayLinkedList(head);
        head = removeTail(head); // Delete the tail Node of Linked List
        displayLinkedList(head);
        head = removeKthNode(head, 3);// Delete the Kth Node of Linked List
        displayLinkedList(head);
        head = removeElementNode(head, 40);// Delete the element Node of Linked List
        displayLinkedList(head);

    }
}
