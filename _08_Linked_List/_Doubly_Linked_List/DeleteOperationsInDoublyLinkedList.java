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

public class DeleteOperationsInDoublyLinkedList {

    public static Node removeKthNode(Node head, int k) {
        Node kthNode = head;
        int count = 0;
        while (kthNode != null) {
            count++;
            if (count == k)
                break;
            kthNode = kthNode.next;
        }
        Node prevNode = kthNode.back;
        Node frontNode = kthNode.next;

        if (prevNode == null && frontNode == null) { //if only 1 node or no node is present
            return null;
        } else if (prevNode == null) { // if k = 1
            return removeHeadNode(head);
        } else if (frontNode == null) { //if k = last node
            return removeTailNode(head);
        }
        prevNode.next = frontNode;
        frontNode.back = prevNode;
        kthNode.next = null;
        kthNode.back = null;
        return head;
    }

    public static Node removeTailNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node oldTail = head;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
        }
        Node newTail = oldTail.back;
        newTail.next = null;
        oldTail.back = null;
        return head;
    }

    public static Node removeHeadNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node oldHead = head;
        head = head.next;

        oldHead.next = null;
        head.back = null;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        Node head = ArrayToDoublyLinkedList.arrayToDLL(arr); // Here I am using the Array to doubly linkedlist method.

        ArrayToDoublyLinkedList.display(head);
        head = removeHeadNode(head);
        ArrayToDoublyLinkedList.display(head);
        head = removeTailNode(head);
        ArrayToDoublyLinkedList.display(head);
        head = removeKthNode(head,2);
        ArrayToDoublyLinkedList.display(head);
    }
}
