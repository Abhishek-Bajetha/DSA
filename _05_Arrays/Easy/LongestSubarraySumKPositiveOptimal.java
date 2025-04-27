package _05_Arrays.Easy;

public class LongestSubarraySumKPositiveOptimal {

    public static int longestSubarraySumKPositiveOptimal(int arr[], int target) {
        int left = 0, right = 0, sum = arr[0], maxLength = 0, n = arr.length;
        while (right < n) {
            while (left <= right && sum > target) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n)
                sum = sum + arr[right];
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        int largestLength = longestSubarraySumKPositiveOptimal(arr, 4);
        System.out.println("Largest length: " + largestLength);
    }
}
