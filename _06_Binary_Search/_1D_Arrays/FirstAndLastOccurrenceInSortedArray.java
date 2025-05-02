package _06_Binary_Search._1D_Arrays;

public class FirstAndLastOccurrenceInSortedArray {
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

    public static int upperBoundInArray(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = high - low / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] firstAndLastOccurrenceInSortedArray(int arr[], int target) {
        int first = lowerBoundInArray(arr, target);
        if (first == arr.length || arr[first] != target )
            return new int[] { -1, -1 };
        int last = upperBoundInArray(arr, target);
        return new int[] { first, last - 1 };
    }

    public static void main(String[] args) {
        int target = 3;
        int[] arr = { 2,2};
        int[] result = firstAndLastOccurrenceInSortedArray(arr, target);
        System.out.println("first: " + result[0] + " Second: " + result[1]);
    }
}
