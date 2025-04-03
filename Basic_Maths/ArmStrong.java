package Basic_Maths;

public class ArmStrong {
    public static void armStrong(int number) {
        int armstrong = 0, copy = number, count = 0;
        while (copy > 0) {
            copy = copy / 10;
            count++;
        }
        copy = number;
        while (number > 0) {
            int r = number % 10;
            armstrong = armstrong + (int) Math.pow(r, count); // pow(exponent, power)
            number = number / 10;
        }
        if (armstrong == copy) {
            System.out.println("This is Armstrong");
        } else {
            System.out.println("This is not Armstrong");
        }
    }

    public static void main(String[] args) {
        int number = 9474;
        armStrong(number);
    }
}
