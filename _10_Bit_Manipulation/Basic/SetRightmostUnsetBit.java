package _10_Bit_Manipulation.Basic;

public class SetRightmostUnsetBit {
    public static int setRightmostUnsetBit(int n) {
        n = n | (n + 1);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(setRightmostUnsetBit(23));
    }
}

// Similar question is : Unset the Rightmost Set Bit