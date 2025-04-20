package _05_Arrays.Easy;

import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        HashSet<Integer> set = new HashSet<>();

        // Insert values in HashSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // Insert values in nums array
        for (int x : set) {
            nums[j++] = x;
        }

        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { -1, 1, 2, 2, 2, 4, 5, 6 };
        int size = removeDuplicates(nums);
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
