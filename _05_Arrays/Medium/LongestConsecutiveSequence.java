package _05_Arrays.Medium;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        int longest = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println("longest cosecutive is: " + longestConsecutiveSequence(new int[] { 100, 4, 200, 1, 3, 2 }));

    }
}
