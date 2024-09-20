import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;
    
    public Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class doubly_circular_ll {
    Node head = null; // Reference to the head node.
    Node tail = null; // Reference to the tail node.
    Scanner sc = new Scanner(System.in);
    
    // Function to create a node and attach it to the end.
    void create() {
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            head.next = head.prev = head; // Circular linking
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = head;
            head.prev = newnode;
            tail = newnode;
        }
    }
    
    void insert_at() {
        if (head == null) {
            create();
        } else {
            Node temp = head;
            System.out.println("Enter the position:");
            int pos = sc.nextInt();

            if (pos == 1) {
                System.out.println("Enter the data:");
                int data = sc.nextInt();
                Node newnode = new Node(data);
                newnode.next = head;
                newnode.prev = tail;
                head.prev = newnode;
                tail.next = newnode;
                head = newnode;
                return;
            }

            int i = 1;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
                if (temp == head) {
                    System.out.println("Position exceeds the actual length of the linked list.");
                    return;
                }
            }
            
            System.out.println("Enter the data:");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next.prev = newnode;
            temp.next = newnode;
            if (temp == tail) tail = newnode; // Update tail if inserted at the end
        }
    }
    
    void insert_end() {
        if (head == null) {
            create();
        } else {
            System.out.println("Enter the data:");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = head;
            head.prev = newnode;
            tail = newnode;
        }
    }
    
    public void delLast() {
        if (head == null || head.next == head) 
            System.out.println("no elements present");
        if (head.next == head) {
            System.out.println("one element present");
        }
        Node last = head.prev;
        last.prev.next = head;
        head.prev = last.prev;
        };
    
    void deleFirst(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else if (head == tail) { // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    void traverse_forward() {
        if (head == null) {
            System.out.println("There is no element present.");
        } else {
            Node temp = head;
            do {
                System.out.println("The data is " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }
    
    void traverse_backward() {
        if (head == null) {
            System.out.println("There is no element present.");
        } else {
            Node temp = tail;
            do {
                System.out.println("The data is " + temp.data);
                temp = temp.prev;
            } while (temp != tail);
        }
    }

    public static void main(String[] args) {
        doubly_circular_ll list = new doubly_circular_ll();
        list.create();
        list.create();
        list.insert_at();
        list.deleFirst();
        list.delLast();
        list.traverse_forward();
        list.traverse_backward();
    }
}
