package _02_Recursion.Easy;

public class NToOne {
    static void nToOne(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        nToOne(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        nToOne(n);
    }
}
