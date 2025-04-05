package _02_Recursion.Easy;

public class PrintNTimes {
    static void printNTimes(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println("Abhishek" + n);
            printNTimes(n - 1);
        }
    }

    public static void main(String[] args) {
        printNTimes(5);
    }
}
