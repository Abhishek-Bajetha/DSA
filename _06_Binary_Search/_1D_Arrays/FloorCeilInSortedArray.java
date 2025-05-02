package _06_Binary_Search._1D_Arrays;

public class FloorCeilInSortedArray {
    public static int[] floorCeilInSortedArray(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int floor = -1, ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                floor = arr[mid];
                low = mid + 1;
            }
        }
        int result[] = { floor, ceil };
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19};
        int result[] = floorCeilInSortedArray(arr, 5);
        System.out.println("floor: "+result[0] + " ceil: " + result[1]);
    }
}
