

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


public class linked_list1 {
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
            tail.next = newnode; //use tail mostly or else u can use temp to traverse.
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
         int i = 1;
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
        } 
        else {
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
            while (i < pos-1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
    }

    void length() {
        if (head == null) {
            System.out.println("no elements present");
        }
        else {
            Node temp = head;
            int i = 1;
            while (temp != null) {
                temp = temp.next;
                i++;
            }
            System.out.println("the total number of elements is" + (i - 1)+"");
        }
    }
    public static void main(String[] args) {
        linked_list1 list = new linked_list1();
        Scanner sc=new Scanner(System.in);
        boolean nextp=true;
        while (nextp) {
            System.out.println(
                    "1.CREATE \n 2.INSERT AT BEGINING \n 3.INSERT AT POSITION \n 4.INSERT AT END \n 5.DELETE AT BEG \n 6.DELETE AT END \n 7.DELETE AT POSITION \n 8.TRAVERSE \n 9.FIND LENGTH OF LINKED LIST \n 10.break");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the number of elements to be inserted");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        list.create();
                    }
                    System.out.println("Elements inserted successfully");
                    break;
                case 2:
                    list.insert_at_begin();
                    break;
                case 3:
                    list.insert_at_();
                    break;
                case 4:
                    list.create();
                    break;
                case 5:
                    list.delete_beg();
                    break;
                case 6:
                    list.delete_at_position();
                    break;
                case 7:
                    list.delete_end();
                    break;
                case 8:
                    list.traverse();
                    break;
                case 9:
                    list.length();
                    break;
                case 10:
                    System.out.println("Thakyou");
                    nextp = false;
                    break;
                default:
                    System.out.println("Invalid input");
                  
            }
        }        
    }
}

