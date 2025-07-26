package _07_String.Basic;

public class ReverseWordsInString {
    public static String reverseWordsInString(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" +");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordsInString("  the sky  is blue "));
    }
}
