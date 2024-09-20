public class Main {

    public static void main(String[] args) {
        
        int[] A = { 1, 5, 10, 20, 30 };
        int[] B = { 5, 13, 15, 20 };
        int[] C = { 5, 20 };

        int i = 0, j = 0, k = 0;
        int commonCount = 0;

        int maxSize = Math.min(A.length, Math.min(B.length, C.length));
        int[] common = new int[maxSize];

        
        while (i < A.length && j < B.length && k < C.length) {
            if (A[i] == B[j] && B[j] == C[k]) {

                common[commonCount++] = A[i];
                i++;
                j++;
                k++;

                while (i < A.length && A[i] == A[i - 1]) {
                    i++;
                }

                while (j < B.length && B[j] == B[j - 1]) {
                    j++;
                }

                while (k < C.length && C[k] == C[k - 1]) {
                    k++;
                }
            } 
            else if (A[i] < B[j]) {
                i++;
            } 
            else if (B[j] < C[k]) {
                j++;
            } 
            else {
                k++;
            }
        }

        // Print the common elements
        System.out.print("Common Elements: ");
        for (int index = 0; index < commonCount; index++) {
            System.out.print(common[index] + " ");
        }
    }
}
