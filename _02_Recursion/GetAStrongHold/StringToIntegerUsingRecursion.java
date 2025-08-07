package _02_Recursion.GetAStrongHold;

public class StringToIntegerUsingRecursion {

    public static int stringToInteger(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int i = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        return helper(s, i, 0, sign);
    }

    private static int helper(String s, int i, int num, int sign) {
        if (i >= s.length() || !(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
            return num * sign;
        }

        int digit = s.charAt(i) - '0';

        if (num > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = num * 10 + digit;

        return helper(s, i + 1, num, sign);
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(stringToInteger(s));  
    }
}
