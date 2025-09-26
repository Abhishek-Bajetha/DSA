package _06_Binary_Search._2_BS_In_Answers;

public class CapacityToShipPackages {
    public static int findTotalDays(int[] weights, int capacity) {
        int day = 1, load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                day = day + 1;
                load = weights[i];
            } else {
                load = load + weights[i];
            }
        }
        return day;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
        int low = max;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalDays = findTotalDays(weights, mid);
            if (totalDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}