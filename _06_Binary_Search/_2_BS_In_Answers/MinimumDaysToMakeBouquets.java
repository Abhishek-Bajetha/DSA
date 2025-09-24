package _06_Binary_Search._2_BS_In_Answers;

public class MinimumDaysToMakeBouquets {
    public static int countBouquet(int[] arr, int d, int k) {
        int totalBouquet = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= d) {
                count++;
            } else {
                totalBouquet += count / k;
                count = 0;
            }
        }
        totalBouquet += count / k;
        return totalBouquet;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int mini = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
            mini = Math.min(mini, bloomDay[i]);
        }
        while (mini <= max) {
            int mid = (mini + max) / 2;
            int count = countBouquet(bloomDay, mid, k);
            if (count >= m) {
                ans = mid;
                max = mid - 1;
            } else if (count < m) {
                mini = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] bloomDay = { 1, 10, 3, 10, 2 };
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k));
    }
}
