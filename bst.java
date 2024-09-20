import java.util.*;

//ref geeksforgeeks  for creare() and search();
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
//can't we create a tree right away fully without passing each function to it>
public class bst {
    Node root = null;
    public Node Create() {
        
        if (root == null) {
            return new Node();
       }
    }

    public void search() {
        
    }
    public static void main(String[] args) {
        Node root = null;
    }
}
