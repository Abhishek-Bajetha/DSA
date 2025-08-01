package _10_Bit_Manipulation.Basic;

public class OddOrNot {
    public static boolean oddOrNot(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        
        if (oddOrNot(7)) {
            System.err.println("Odd");
        } else {
            System.err.println("Even");
            
        }
    }
}
