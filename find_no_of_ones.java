import java.util.*;
class find_no_of_ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int max=0,row=0;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; i++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                row = i;
            }
        }
        System.out.println("the row with maximum number of ones is "+row);
        
    }
}
