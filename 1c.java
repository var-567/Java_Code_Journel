import java.io.*;
import java.util.Scanner;
public class Factorial {
    public static int fact(int x)
    {
        if(x==1)
            return 1;
        else    
            return(fact(x-1)*x);
    }
    public static void main(String[] args) 
    {
        int n,result;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=in.nextInt();
        result=fact(n);
        System.out.println("The factorial of " +n + " is " + result);
    }
}
