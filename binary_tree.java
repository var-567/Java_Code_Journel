import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class binary_tree {
    Node root = null;
    Scanner sc = new Scanner(System.in);

    //function to create a complete tree.
    public Node Create(String node,int data1) {
        System.out.println("Enter the data of "+node +" node "+data1+" /if no data enter -1");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        
        Node newnode = new Node(data);
        
        newnode.left = Create("left",data);
        newnode.right = Create("right", data);
        root = newnode;
        return newnode;//this method retruns a reference of node.

    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
     
    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void traverse() {
        System.out.println("Inorder Traversal");
        inorder(root);
        System.out.println("Preorder traversal");
        preorder(root);
        System.out.println("Preorder traversal");
        postorder(root);
    }
    

    public static void main(String[] args) {
        binary_tree tree = new binary_tree();
        Node a = tree.Create("root",-1);
        System.out.println("the root node is" + a.data);
        tree.traverse();
    }
}





/*
PS E:\varshini\java\ds_problems_in_training> java binary_tree      
Enter the data of root node -1 /if no data enter -1
3
Enter the data of left node 3 /if no data enter -1
2
Enter the data of left node 2 /if no data enter -1
-1
Enter the data of right node 2 /if no data enter -1
-1
Enter the data of right node 3 /if no data enter -1
5
Enter the data of left node 5 /if no data enter -1
-1
Enter the data of right node 5 /if no data enter -1
-1
the root node is3
*/