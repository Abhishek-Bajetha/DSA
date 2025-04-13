package _05_Arrays.Easy;

public class CheckIfArrayIsSortedLeetcode1752 {
    public static boolean check(int[] arr) {
        int p = 0;
        boolean x = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                p = i + 1;
                x = false;
                break;
            } else {
                x = true;
            }
        }
        if (x == true) {
            return true;
        }

        for (int i = 0; i < arr.length - p; i++) {
            int last = arr[arr.length-1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                p = i + 1;
                x = false;
                break;
            } else {
                x = true;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(check(arr));
    }

}