class Node {
    int data;
    Node next;
}
public class Alternalte_elements_ll {
    Node head;

    void insert(int data) {
        Node temp = head;
        
        while (true) {
            if (temp == null) {
            temp = new Node();
            temp.data = data;
            temp.next = null;
            head = temp;
            break;
            }
            else if (temp.next == null) {
                temp.next = new Node();
                temp.next.data = data;
                temp.next.next = null;
                break;
            }
            else {
                temp = temp.next;
            }
        }
    }

    void traverse() {
        if (head == null) {
            System.out.println("No elements present");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }
    //function to swap alternate nodes
    void alternate_node() {
        Node curr = head;
        if (head.next == null) {
            System.out.print("Only one element present!!");
        } else {
            head = curr.next;
            while (curr.next != null) {
                Node n = curr.next;
                if (n.next != null) {
                    Node temp = n.next;
                    curr.next = n.next.next;
                    n.next = curr;
                    curr = temp;
                } else {
                    n.next = curr;
                    curr.next = null;
                }
            }
        }
    }
   //function to swap alternate data.
   void alternate_value() {
       Node curr = head;
       while (curr.next != null) {//alternate condition:loop only is there are two other nodes after this node.
           int temp = curr.data;
           curr.data = curr.next.data;
           curr.next.data = temp;
           if (curr.next.next != null) {
               curr = curr.next.next;
           } else {
               break;
           }
       }
   }
    
    public static void main(String[] args) {
        Alternalte_elements_ll list = new Alternalte_elements_ll();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.traverse();
        //10->20->30->40->50->60
        System.out.println("after swapping adjacent nodes");
        list.alternate_node();
        list.traverse();
        //20->10->40->30->60->50
        System.out.println("after swapping adjacent elements");
        list.alternate_value();
        list.traverse();

        
    }
}