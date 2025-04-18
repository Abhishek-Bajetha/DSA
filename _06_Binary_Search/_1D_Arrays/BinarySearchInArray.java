package _06_Binary_Search._1D_Arrays;

public class BinarySearchInArray {
    public static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, 6, 8, 9, 13, 16 };
        System.out.println(binarySearch(arr, 9));
    }
}
