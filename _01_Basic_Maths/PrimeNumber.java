package _01_Basic_Maths;

import java.util.Scanner;

public class PrimeNumber {

    public static void primeNumber(int number) {
        int flag = 1;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("Not Prime");
                return;
            } else
                flag = 0;
        }
        if (flag == 0)
            System.out.println("Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        primeNumber(number);
        sc.close();
    }
}
