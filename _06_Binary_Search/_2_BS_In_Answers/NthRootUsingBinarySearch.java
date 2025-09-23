package _06_Binary_Search._2_BS_In_Answers;

public class NthRootUsingBinarySearch {

    private static int nthPower(int mid, int n) {
        int power = 1;
        for (int i = 0; i < n; i++) {
            power = power * mid;
        }
        return power;
    }

    public static int nthRootUsingBinarySearch(int number, int n) {
        int low = 0;
        int high = number;
        while (low <= high) {
            int mid = (low + high) / 2;
            int check = nthPower(mid, n);
            if (check == number) {
                return mid;
            } else if (check > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number = 16, n = 4;
        System.out.println(nthRootUsingBinarySearch(number, n));
    }
}