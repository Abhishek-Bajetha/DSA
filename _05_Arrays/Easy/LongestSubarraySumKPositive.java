package _05_Arrays.Easy;

public class LongestSubarraySumKPositive {
    public static int longestSubarraySumKPositive(int arr[], int target) {
        int sum, largestLength = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == target) {
                    if (largestLength < j - i + 1) {
                        largestLength = j - i + 1;
                    }
                } else if (sum > target) {
                    break;
                }
            }
        }
        return largestLength;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int largestLength = longestSubarraySumKPositive(arr, 6);
        System.out.println("Largest length: " + largestLength);
    }
}
