package _06_Binary_Search._2_BS_In_Answers;

public class SmallestDivisorGivenThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int maxi = Integer.MIN_VALUE;
        int mini = 0;

        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        while (mini <= maxi) {
            int mid = (mini + maxi) / 2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += Math.ceil((double) nums[i] / (double) mid);
            }
            if (sum <= threshold) {
                maxi = mid - 1;
            } else {
                mini = mid + 1;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}