package _07_String.Basic;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = t.charAt(i) - 'a';
            freq[index] -= 1;
        }
        int n = 1;
        while (n < 26) {
            if (freq[n++] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
