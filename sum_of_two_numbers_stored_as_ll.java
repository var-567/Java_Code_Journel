/*
 * Question: sum of the two n digit number where each digit is stored in a node of a linkedlist and store the sum again in a linkedlist.
 * Explanation:
 * n=3(number of digit)
 * n1=742 stored as reverse linked_list_1 = 2->4->7
 * n2=465 stored as reverse linked_list_2 = 5->6->4
 * sum=2    4     7(1 carry)
 *     +    +     +
 *     5    6     4
 *   ----------------
 *     7    0     1    1
 *
 * sum=1107         
 */



import java.util.*;

class Node {
    int data;
    Node next;
     
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    
}

public class linked_list {

    
    public static void main(String[] args) {
        
    }
}