class Node {
    int data;//no need to specify the public modifier since it is Package-Private (Default)
              //PAckage- private(default): The member is accessible only within its own package.
    Node next;
    }

    public class llinked_list {
    Node head;
    void traverse() {
        Node temp=head;
        while (temp!=null) {        
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void insertBeg(int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
        }
        else {
            Node temp = new Node();
            temp.data = data;
            temp.next = head;
            head = temp;
        }
    }
    
    public static void main(String args[]) {
        llinked_list new_list = new llinked_list();
        new_list.insertBeg(10);
        new_list.insertBeg(20);
        new_list.insertBeg(30);
        new_list.insertBeg(40);
        new_list.insertBeg(50);
        new_list.traverse();
    }

}
