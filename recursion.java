import java.util.*;

public class recursion {
    public static void natural_num(int a) {
        if (a == 1) {
            System.out.println(a);
        }
        else {
            System.out.println(a);
            natural_num(a - 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        natural_num(a);

    }
}
