package _01_Basic_Maths;

import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        System.out.println(count);
        sc.close();
    }
}