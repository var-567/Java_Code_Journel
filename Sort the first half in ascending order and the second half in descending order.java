import java.util.*;
 
public class Sort {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,5,2,3,6,3,5,6};
        int temp;
    for(int i=0;i < n-1;i++)
    {
        for (int j = 0; j < n / 2; j++) {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        for(int j = n/2;j < n-1; j++)
        {
            if(a[j] < a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
	
	for(int i = 0; i < n; i++)
	    printf("%d ", a[i]);

    }
    
}
