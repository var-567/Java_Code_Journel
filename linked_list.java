
import java.util.*;
//linkedlist implementation with construct
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class linked_list {
    Node head=null;//head referece
    Node tail = null;//tail reference
    Scanner sc = new Scanner(System.in);
    //function to insert at the end.
    void create() {
        
        System.out.print("Enter the data");
        int data = sc.nextInt();
        //create a node.
        Node newnode = new Node(data);
        //link the node.
        //if there is no node head will be null so 
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
     //insert at the beginig
    void insert_at_begin() {
         if (head == null) {
             create();
         } else {
             System.out.println("Enter the data");
             int a = sc.nextInt();
             Node newnode = new Node(a);
             newnode.next = head;
             head = newnode;
         }

     }

    void insert_at_() {
         System.out.println("Enter the position");
         int pos = sc.nextInt();
         System.out.println("enter the data");
         int data = sc.nextInt();
         Node temp = head;
         int i = 0;
         Node newnode = new Node(data);
         while (i < pos - 1) {
             if (temp.next == null) {
                 System.out.println("no such position");
                 break;
             } else {
                 temp = temp.next;
                 i++;
             }
         }
         newnode.next = temp.next;
         temp.next = newnode;
     }

    
    void traverse() {
         Node temp = head;
         while (temp != null) {
             System.out.println(temp.data);
             temp = temp.next;
         }
     }

    //delete at begin
     void delete_beg() {
        if (head == null) {
            System.out.println("no elements present");
        } else {
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
    }
    //delete at end.
    void delete_end() {
        if (head == null) {
            System.out.println("no elements present");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    //delete at the position.
    void delete_at_position() {

        if (head == null) {
            System.out.println("no elements present");
        } 
        else {
            System.out.println("Enter the position in to be deleted");
            int pos = sc.nextInt();
            Node temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            temp = temp.next.next;
        }

    }
    
    public static void main(String[] args) {
        linked_list list = new linked_list();
        for (int i = 0; i < 6; i++) {
            list.create();
        }
        list.traverse();
    }
}
