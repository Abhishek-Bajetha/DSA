package _10_Bit_Manipulation.Basic;

public class IthBitSetOrNot {
    public static boolean ithBitSetOrNot(int n, int i) {
        if (((n >> i) & 1) == 0) {
            return false;
        } else { 
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(ithBitSetOrNot(5, 0));
    }
}
