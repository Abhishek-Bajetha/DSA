package _06_Binary_Search._2_BS_In_Answers;

public class KthMissingPositiveNumber {
    //this is not a binary solution...
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 2;
        System.out.println(findKthPositive(arr,k));
    }
}
