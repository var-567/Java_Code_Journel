import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }    
}

class linked_list {
    Node head = null;
    Node tail = null;

    public void create(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } 
        else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void add(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            System.out.println("no element present in the linkedlist");
        } else {
            while (head1 != null && head2 != null) {
                create(head1.data + head2.data);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
    
    public void traverse() {
        if (head == null) {
            System.out.println("No elements present");
        }
        else {
            Node temp = head;
            System.out.println("The elements in the linked list are:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linked_list list1 = new linked_list();
        linked_list list2 = new linked_list();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in both the linked list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the first list");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list1.create(a);
        }
        System.out.println("Enter the elements of the second list");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list2.create(a);
        }
        linked_list list3 = new linked_list();
        list3.add(list1.head, list2.head);
        list3.traverse();
    }
}