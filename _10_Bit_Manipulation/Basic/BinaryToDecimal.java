package _10_Bit_Manipulation.Basic;

public class BinaryToDecimal {
    public static int binaryToDecimal(String b) {
        int i, decimal, p2;
        i = b.length() - 1;
        p2 = 1;
        decimal = 0;
        while (i >= 0) {
            if (b.charAt(i) == '1') {
                decimal = decimal + p2;
            }
            p2 *= 2;
            i--;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1010"));
    }
}
