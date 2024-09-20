public class remove_space_from_a_string {
    public static void main(String[] args) {
        String str = "welcome to java programming";
        String op = "";
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch != ' ') {
                op += ch;
            }
        }
        
        System.out.println(op);
    }
}
