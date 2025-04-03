package Basic_Maths;

public class Palindrome {
    public static boolean palindrome(int number) {
        int copy = number, newNumber = 0;
        while (number > 0) {
            int r = number % 10;
            newNumber = newNumber * 10 + r;
            number = number / 10;
        }
        if (copy == newNumber)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 1234321;
        System.out.println(palindrome(number));
    }
}
