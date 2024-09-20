class check_if_anagram {
    public static void main(string[] args) {
        String s1 = "listen";
        String s2 = "silent";
        int[] count = new int[26];
        if (s1.length() != s2.length()) {
            System.out.println("not an anagram");
        }
        else {
            for (int i = 0; i < s1.length();i++) {
                char c = (char) s1.charAt(i);
                count[c - 'a']++;
            }

            for (int i = 0; i < s2.length();i++) {
                char c = (char) s2.charAt(i);
                count[c - 'a']--;
            }
           
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    System.out.println("an anagram");
                }
                else {
                    System.out.println("not an anagram");
                }
            }
        }
        
    }
}