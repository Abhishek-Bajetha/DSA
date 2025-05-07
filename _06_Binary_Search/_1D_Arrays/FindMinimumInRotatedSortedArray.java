package _06_Binary_Search._1D_Arrays;

public class FindMinimumInRotatedSortedArray {
    public static int findMinimumInRotatedSortedArray(int arr[]) {
        int low, high, answer;
        low = 0;
        high = arr.length - 1;
        answer = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] < arr[high]) {
                answer = Math.min(answer, arr[low]);
                break;
            }

            if (arr[low] <= arr[mid]) {
                answer = Math.min(answer, arr[low]);
                low = mid + 1;
            } else {
                answer = Math.min(answer, arr[mid]);
                high = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(findMinimumInRotatedSortedArray(arr));
    }
}
