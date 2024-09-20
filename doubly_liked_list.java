import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;
    
    public Node(int data) {
        this.data = data;
        this.next = this.prev = null;
}
}
public class doubly_liked_list {
    Node head = null;//reference to the head node.always points to the head node.initially null.
    Node tail = null;//referece to the tail node.always points to the tail node.
    Scanner sc = new Scanner(System.in);
    //function to create a node and attach it to the end.
    void create() {
        System.out.println("Enter the data");
        int data = sc.nextInt();
        Node newnode = new Node(data);
        if (head == null) {
            tail = head = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    
    void insert_at() {
        //if head is itself null.
        if (head == null) {
            create();
        } else {
            Node temp = head;
            System.out.println("Enter the position");
            int pos = sc.nextInt();

            int i = 1;
            while (i < pos-1) {
                temp = temp.next;
                //if the length of the linked list is less than the position to be inserted.
                i++;
                if (temp == null) {
                    System.out.println("position exceeds the actual length of the linkedlist.");
                    break;
                }
                
            }
            
            System.out.println("Enter the data");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next = newnode;
            newnode.next.prev = newnode;
        }
    }
    
    //while inserting at the end accessig the tail node and manipulating it is enough.
    void insert_end() {
        if (tail == null) {
            System.out.println("No elements present");
        } else {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    static Node delLast(Node head) {
        if (head == null) 
            return null;
        if (head.next == null) {
            return null;
        }        
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        return head;
    }  
  
    void deleFirst(){
        
    }
    void traverse_forward() {
        if (head == null) {
            System.out.println("There is no element present");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.println("the data is " + temp.data);
                temp = temp.next;
            }
            System.out.println("the data is " + temp.data);
        }
    }
    
    void traverse_backward() {
        if (head == null) {
            System.out.println("there is no element");
        } else {
            Node temp = tail;
            System.out.println(temp.data);
            while (temp.prev != null) {
                temp = temp.prev;
                System.out.println(temp.data);
            }
        }
    }
    

    

    public static void main(String[] args) {
        doubly_liked_list list = new doubly_liked_list();
        list.create();
        list.create();
        list.insert_at();
        list.traverse_forward();
        list.traverse_backward();
        
    }
}
