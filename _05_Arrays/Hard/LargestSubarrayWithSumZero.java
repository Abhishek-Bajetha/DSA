package _05_Arrays.Hard;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {
    public static int largestSubarrayWithSumZero(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.get(sum) != null) { //if(map.containsKey(sum))
                    max = Math.max(max, i - map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int length = largestSubarrayWithSumZero(arr);
        System.out.println(length);
    }
}