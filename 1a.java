
import java.util.*;
class Inputs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Integer");
        int a=sc.nextInt();
        System.out.println("enter a float");
        float b=sc.nextFloat();
        System.out.println("enter a double");
        double c=sc.nextDouble();
        System.out.print("enter the String ");
        String d=ss.nextLine();
        System.out.println("d is"+d);
        System.out.println("enter a line");
        String e=ss.nextLine();
        System.out.println("the input values are");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
    }
}