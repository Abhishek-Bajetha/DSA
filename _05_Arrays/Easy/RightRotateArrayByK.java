package _05_Arrays.Easy;

public class RightRotateArrayByK {
    static void reftRotateArrayByK(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        while (k > 0) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            k--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        reftRotateArrayByK(arr, 3);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
