package _06_Binary_Search._1D_Arrays;

public class LowerBoundInArray {
    public static int lowerBoundInArray(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = high - low / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 7, 9, 10, 11, 13, 14, 15, 16 };
        System.out.println(lowerBoundInArray(arr, 12));
    }
}
