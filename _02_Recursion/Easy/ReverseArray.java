package _02_Recursion.Easy;

public class ReverseArray {

    static void reverseArray(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
        reverseArray(i + 1, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverseArray(0, arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
