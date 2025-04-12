package _05_Arrays.Easy;

public class SecondLargestElementInArray {
    static int secondLargestElementInArray(int arr[]) {
        int large = arr[0], sLarge = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                sLarge = large;
                large = arr[i];
                
            }
            if (arr[i] > sLarge && arr[i] < large) {
                sLarge = arr[i];
            }
        }
        return sLarge;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 9, 6 };
        System.out.println(secondLargestElementInArray(arr));
    }
}
