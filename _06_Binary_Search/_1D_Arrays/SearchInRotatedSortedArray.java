package _06_Binary_Search._1D_Arrays;

public class SearchInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int target = 0;
        int arr[] = {5,1,3};
        System.out.println("Index: " + searchInRotatedSortedArray(arr, target));
        ;
    }
}
