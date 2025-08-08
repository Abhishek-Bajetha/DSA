package _11_SlidingWindow_2Pointers.Easy;

public class MaximumPointsFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, maxsum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum + cardPoints[i];
        }
        maxsum = lsum;

        if (cardPoints.length == k)
            return maxsum;

        int rightIdx = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            rsum = rsum + cardPoints[rightIdx];
            lsum = lsum - cardPoints[i];
            maxsum = Math.max(maxsum, lsum + rsum);
            rightIdx--;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1 };
        System.out.println(maxScore(arr, 7));
    }
}
