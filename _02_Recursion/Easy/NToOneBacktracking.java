package _02_Recursion.Easy;

public class NToOneBacktracking {
    static void nToOneBacktracking(int i, int n) {
        if (n == 0)
            return;
        nToOneBacktracking(i + 1, n - 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;
        nToOneBacktracking(1, n);
    }
}
