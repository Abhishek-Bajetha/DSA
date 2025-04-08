package _02_Recursion.Easy;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial: "+factorial(n));
    }
}
