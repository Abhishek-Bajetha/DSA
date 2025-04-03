package Basic_Maths;

public class ReverseANumber {
    public static int reverseTheNumber(int number) {
        int reverse = 0;

        while (number > 0) {
            int r = number % 10;
            reverse = 10 * reverse + r;
            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(reverseTheNumber(number));
    }
}
