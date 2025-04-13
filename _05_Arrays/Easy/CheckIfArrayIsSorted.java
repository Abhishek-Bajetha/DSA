package _05_Arrays.Easy;

public class CheckIfArrayIsSorted {
    public static boolean check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(check(arr));
    }

}