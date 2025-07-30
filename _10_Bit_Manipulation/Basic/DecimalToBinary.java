package _10_Bit_Manipulation.Basic;

public class DecimalToBinary {
    public static String decimalToBinary(int d) {
        String s ="";
        while (d > 0) {
            int rem = d % 2;
            if (rem == 1) {
                s = "1" + s;
            } else {
                s = "0" + s;
            }
            d /= 2;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(7
        ));
    }
}
