package _06_Binary_Search._2_BS_In_Answers;

import java.util.Arrays;

public class KokoEatingBananas {
     public static int totalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) (v[i]) / (double) (hourly));
        }
        return totalH;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        Arrays.sort(piles);
        int left = 0;
        int right = max;
        while (left <= right) {
            int mid = (left + right) / 2;
            int reqHours = totalHours(piles, mid);
            if (reqHours <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        System.out.println(minEatingSpeed(piles,h));
    }
}
