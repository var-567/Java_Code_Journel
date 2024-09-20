import java.util.*;

public class remove_paranthesis_from_regular_expression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "a+(b-c)";
        String output="";
        char strc[] = str.toCharArray();
        for (int i = 0; i < strc.length; i++) {
            if (strc[i] != ')' && strc[i] != '(') {
                output += strc[i];
            }
        }
        System.out.println(output);
    }
}
