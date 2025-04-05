package _01_Basic_Maths;

public class GcdOrHcf {
    public static int gcdOrHcf(int n1, int n2) {
        int hcf = 1;
        if (n2 % n1 == 0) {
            return n1;
        } else {
            for (int i = 1; i <= n1 / 2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    hcf = hcf * i;
                }
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        int number1 = 11, number2 = 20;
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        int gcd = gcdOrHcf(number1, number2);
        System.out.println("HCF/GCD: " + gcd);
    }
}
