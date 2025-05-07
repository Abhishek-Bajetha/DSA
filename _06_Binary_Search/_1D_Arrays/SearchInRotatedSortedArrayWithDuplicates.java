package _06_Binary_Search._1D_Arrays;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static boolean searchInRotatedSortedArrayWithDuplicates(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
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

        return false;
    }

    public static void main(String[] args) {
        int target = 3;
        int arr[] = {2, 5, 6, 0, 0, 1, 2};
        System.out.println("Index: " + searchInRotatedSortedArrayWithDuplicates(arr, target));
    }
}
