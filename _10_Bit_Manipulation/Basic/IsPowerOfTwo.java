package _10_Bit_Manipulation.Basic;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        if ((n & n - 1) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (isPowerOfTwo(16)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
