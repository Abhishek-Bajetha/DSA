package _02_Recursion.Easy;

public class OneToN {

    static void oneToN(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i + " "); // <-- this line is printning the numbers before calling the method.(so this is not backtracking.)
        oneToN(i + 1, n);
        return;
    }

    public static void main(String[] args) {
        int n = 5;
        oneToN(1, n);
    }
}
