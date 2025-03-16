import java.util.Scanner;

public class Patterns {

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        Patterns.pattern7(n);
        Patterns.pattern8(n);
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int stars = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                stars = 1;
            else
                stars = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(stars);
                stars = 1 - stars;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            spaces -= 2;
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A' + n - i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patterns.pattern16(n);
        sc.close();
    }
}
