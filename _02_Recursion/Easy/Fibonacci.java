package _02_Recursion.Easy;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonacci(n - 1);
        int slast = fibonacci(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n-1));
    }
}
