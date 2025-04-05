package Basic_Maths;

public class PrintAllDivisors {
    public static void printAllDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i+" ");
            }
        }
        return;
    }

    public static void main(String[] args) {
        int number = 36;
        printAllDivisors(number);
    }
}
