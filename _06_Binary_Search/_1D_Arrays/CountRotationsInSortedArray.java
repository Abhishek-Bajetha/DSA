package _06_Binary_Search._1D_Arrays;

public class CountRotationsInSortedArray {
    public static int countRotationsInSortedArray(int arr[]) {
        int low, high, answer, index;
        low = 0;
        high = arr.length - 1;
        answer = Integer.MAX_VALUE;
        index = answer;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < answer) {
                    index = low;
                    answer = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < answer) {
                    index = mid;
                    answer = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
        System.out.println(countRotationsInSortedArray(arr));
    }
}
