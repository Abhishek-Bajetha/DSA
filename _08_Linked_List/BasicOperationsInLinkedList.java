
package _08_Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class BasicOperationsInLinkedList {
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

    public static void traversalLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int lengthOfLL(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static String searchElement(Node head,int val) {
        Node temp = head;
       
        while (temp != null) {
            if (val == temp.data)
                return "Present";
            temp = temp.next;
        }
        return "Not Present";
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        Node head = createLinkedList(arr);
        System.out.println("Head node data is -> "+head.data);
        traversalLL(head);
        System.out.println("Length of LL is -> " + lengthOfLL(head));
        System.out.println(searchElement(head, 30));
    }
}