package _02_Recursion.Easy;

public class OneToNBacktracking {
    static void oneToNBacktracking(int n) {
        if (n == 0) {
            return;
        }
        oneToNBacktracking(n - 1);
        System.out.println(n); //this is backtracking because it is printing values after the method returns.
    }

    public static void main(String[] args) {
        int n = 5;
        oneToNBacktracking(n);
    }
}
