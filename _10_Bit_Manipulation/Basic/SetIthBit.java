package _10_Bit_Manipulation.Basic;

public class SetIthBit {
    public static int setKthBit(int n, int k) {
        return ((1 << k) | n);
    }
    public static void main(String[] args) {
        System.out.println(setKthBit(5, 1));
    }
}
