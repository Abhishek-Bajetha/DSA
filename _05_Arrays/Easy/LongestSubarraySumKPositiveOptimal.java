package _05_Arrays.Easy;

public class LongestSubarraySumKPositiveOptimal {

    public static int longestSubarraySumKPositiveOptimal(int arr[], int target) {
        int j = 0, sum = 0, length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > target) {
                sum = sum - arr[j];
                j++;
            }
            if (sum == target) {
                length = i - j + 1;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 2, 2, 5, 6 };
        int largestLength = longestSubarraySumKPositiveOptimal(arr, 11);
        System.out.println("Largest length: " + largestLength);
    }
}
