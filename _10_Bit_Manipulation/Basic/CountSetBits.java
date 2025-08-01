package _10_Bit_Manipulation.Basic;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count = count + (n & 1);
            n = n >> 1; // its mean n = n / 2
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(0));
    }
}
