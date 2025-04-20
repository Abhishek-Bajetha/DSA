package _05_Arrays.Easy;

public class LeftRotateArrayByK {
    static void leftRotateArrayByK(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        while (k > 0) {
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
            k--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        leftRotateArrayByK(arr, 15);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
