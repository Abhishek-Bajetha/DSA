package _05_Arrays.Medium;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum, count;
        preSum = 0;
        count = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int remove = preSum - k;

            count += map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subarraySum(arr, 3));
    }
}