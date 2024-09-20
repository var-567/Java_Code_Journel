import java.util.*;
public class factorial {
    //factorial of 5
    //1 2 3 4 5 
    public static int factorial(int a){
         
        if(a==0||a==1){
            return 1;
        }
        else{
            return(a*factorial(a-1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=factorial(a);
    }
}
