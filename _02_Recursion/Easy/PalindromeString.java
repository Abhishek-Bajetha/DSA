package _02_Recursion.Easy;

public class PalindromeString {
    static boolean palindromeString(int i, String s, int n) {
        if (s.charAt(i) != s.charAt(n - 1 - i)) {
            return false;
        }
        if (i >= n / 2) {
            return true;
        }

        return palindromeString(i + 1, s, n);
    }

    public static void main(String[] args) {
        String str = new String("msdam");
        System.out.println(palindromeString(0, str, str.length()));
    }
}
