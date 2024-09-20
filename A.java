import java.util.*;
class B {
    protected B(int a) {
        System.out.println("in parameterized constructor");
    }
    
}
public class A{
    public static void main(String[] args) {
        B obj = new B(10);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    }
}