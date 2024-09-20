import java.util.*;

public class number_that_appear_more_than_n_by_k_times {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 4, 4, 7, 4, 6, 6, 6 };
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a=n/k;
        Arrays.sort(arr);
        int currentElement = arr[0];
        int count = 1;

        System.out.println("Elements appearing more than " + a + " times:");
        for (int i = 1; i < n; i++) {
            if (arr[i] == currentElement) {
                count++;
            } else {
                if (count > a) {
                    System.out.println(currentElement);
                }
                currentElement = arr[i];
                count = 1;
            }
        }
        // Check the last group of elements
        if (count > a) {
            System.out.println(currentElement);
        }
    }
    
}
