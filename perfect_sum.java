import java.util.*;
public class perfect_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        //arr={5,2,3,10,6,8}
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[i];
                if (sum == 10) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
