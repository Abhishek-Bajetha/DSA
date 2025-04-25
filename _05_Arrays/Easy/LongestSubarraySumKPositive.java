package _05_Arrays.Easy;

public class LongestSubarraySumKPositive {
    public static int[] longestSubarraySumKPositive(int arr[], int target) {
        int sum;
        int subIndex[] = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == target) {
                    subIndex[0] = i;
                    subIndex[1] = j;
                    return subIndex;
                } else if (sum > target) {
                    break;
                }
            }
        }
        return subIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int subIndex[] = longestSubarraySumKPositive(arr, 7);
        System.out.println("from index: " + subIndex[0] + " to " + subIndex[1]);
    }
}
