import java.util.*;
public class Capitalize_first_last_in_string {
    public static void main(String args[]) {
        String str = "capitalize the first and last character in string";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;
            ch[k] = (char) (ch[k] >= 'a' && ch[k] <= 'z'? ((int) ch[k] - 32): (int) ch[k]);
            ch[i - 1] = (char) (ch[i - 1] >= 'a' && ch[i - 1] <= 'z'? ((int) ch[i - 1] - 32): (int) ch[i - 1]);
        }
        str=new String(ch);
        System.out.println(str);
 
    }
}
