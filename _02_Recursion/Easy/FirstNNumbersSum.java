package _02_Recursion.Easy;

public class FirstNNumbersSum {
    static int firstNNumbersSum(int n) {
        if (n == 0)
            return 0;
        return n + firstNNumbersSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum: " + firstNNumbersSum(n));
    }
}
