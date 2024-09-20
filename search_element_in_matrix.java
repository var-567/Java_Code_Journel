import java.util.*;
public class search_element_in_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int a=sc.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; i++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;i++){
                
                if(a==arr[i][j]){
                    System.out.println("the element is found in "+i+" "+j);
                }
            }
        }        
    }
}
