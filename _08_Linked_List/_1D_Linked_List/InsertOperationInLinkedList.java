package _08_Linked_List._1D_Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

public class InsertOperationInLinkedList {
    public static void displayLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static Node insertHeadNode(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    public static Node insertTailNode(Node head, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        if (head == null)
            return newNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertKthPosition(Node head, int val, int k) {
        Node newNode = new Node(val);
        if (head == null) {
            if (k == 1)
                return newNode;
            else
                return head;
        }
        if (k == 1) {
            newNode.next = head;
            return newNode;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node insertBeforeValue(Node head, int val, int element) {
        Node newNode = new Node(val);
        if (head == null)
            return null;
        if (head.data == element) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data == element) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node head = n1;

        Node n2 = new Node(20);
        n1.next = n2;
        Node n3 = new Node(30);
        n2.next = n3;
        Node n4 = new Node(40);
        n3.next = n4;
        Node n5 = new Node(50);
        n4.next = n5;
        displayLinkedList(head);
        head = insertHeadNode(head, 100);
        displayLinkedList(head);
        head = insertTailNode(head, 200);
        displayLinkedList(head);
        head = insertKthPosition(head, 300, 3);
        displayLinkedList(head);
        head = insertBeforeValue(head, 400, 30);
        displayLinkedList(head);
    }
}
