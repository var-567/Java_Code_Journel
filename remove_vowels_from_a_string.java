import java.util.Scanner;

public class remove_vowels_from_a_string {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "Varshini";
        String output="";
        char strc[] = str.toCharArray();
        for (int i = 0; i < strc.length; i++) {
            if (strc[i] != 'a' && strc[i] != 'e' && strc[i]!='i' && strc[i]!='o' && strc[i]!='u') {
                output += strc[i];
            }
        }
        System.out.println(output);
    }
}
