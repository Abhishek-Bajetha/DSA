package _05_Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int k = n - 1;
                int l = j + 1;
                while (l < k) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[k]);
                        answer.add(temp);
                        k--;
                        l++;
                        while (l < k && nums[k] == nums[k + 1])
                            k--;
                        while (l < k && nums[l] == nums[l - 1])
                            l++;
                    } else if (sum > target)
                        k--;
                    else
                        l++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 2, 2 };
        int target = 8;
        List<List<Integer>> answer = fourSum(nums, target);
        for (List<Integer> list : answer) {
            System.out.print("{");
            for (Integer list2 : list) {
                System.out.print(" "+list2 + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
