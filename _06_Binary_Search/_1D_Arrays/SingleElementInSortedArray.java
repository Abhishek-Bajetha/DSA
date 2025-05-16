package _06_Binary_Search._1D_Arrays;

public class SingleElementInSortedArray {
    public static int singleElementInSortedArray(int arr[]) {
        int low, high, n;
        n = arr.length - 1;
        if (n == 0) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n] != arr[n - 1]) {
            return arr[n];
        }
        low = 1;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (mid % 2 == 1 && arr[mid - 1] == arr[mid] || mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 2, 3, 3};
        System.out.println((singleElementInSortedArray(arr)));
    }
}
