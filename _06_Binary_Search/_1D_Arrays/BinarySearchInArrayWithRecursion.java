package _06_Binary_Search._1D_Arrays;

public class BinarySearchInArrayWithRecursion {
    public static int binarySearchInArrayWithRecursion(int arr[], int low, int high, int target) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        } else if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchInArrayWithRecursion(arr, low, mid - 1, target);
        } else if (arr[mid] < target) {
            return binarySearchInArrayWithRecursion(arr, mid + 1, high, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, 6, 8, 9, 13, 16 };
        System.out.println(binarySearchInArrayWithRecursion(arr, 0, arr.length - 1, 9));

    }
}
