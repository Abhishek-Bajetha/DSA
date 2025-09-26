package _06_Binary_Search._2_BS_In_Answers;

import java.util.Arrays;

public class AggressiveCows {

    private static boolean isValid(int[] stalls, int gaps, int totalCows) {
        int countCows = 1;
        int lastStall = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastStall >= gaps) {
                countCows++;
                lastStall = stalls[i];
            }
            if (countCows >= totalCows) {
                return true;
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 0;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < stalls.length; i++) {
            high = Math.max(high, stalls[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isValid(stalls, mid, k)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] stalls = { 10, 1, 2, 7, 5 };
        int k = 2;
        System.out.println(aggressiveCows(stalls, k));
    }
}
