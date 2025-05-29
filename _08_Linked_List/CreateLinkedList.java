
package _08_Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class CreateLinkedList {
    public static Node createLinkedList(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            mover.next = newNode;
            mover = mover.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        Node head = createLinkedList(arr);
       System.out.println(head.data);
    }
}