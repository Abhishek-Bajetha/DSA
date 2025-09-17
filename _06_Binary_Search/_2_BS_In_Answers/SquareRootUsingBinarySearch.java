package _06_Binary_Search._2_BS_In_Answers;

public class SquareRootUsingBinarySearch {
    public static int squareRootUsingBinarySearch(int n) {
        int left = 1;
        int right = n;
        int answer = -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (mid * mid < n) {
                answer = mid;
                left = mid + 1;
            } else if (mid * mid > n) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(squareRootUsingBinarySearch(9));
    }
}
