package _05_Arrays.Easy;

public class RightRotateArrayByKOptimal {
    public static void reverse(int arr[], int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reftRotateArrayByKOptimal(int[] arr, int k) {
       
        int n = arr.length;
        k = k %  n;
        reverse(arr, 0, n - k - 1); //  because we have to shift rigth so we will count shifting from the (total array - total right shifts - 1)
        // Reverse last k elements
        reverse(arr, n - k, n - 1);
        // Reverse whole array
        reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { -1 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        reftRotateArrayByKOptimal(arr, 2);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
