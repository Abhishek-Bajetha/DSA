package _05_Arrays.Easy;

public class SingleNumberInTwiceArray {
    public static int singleNumberInTwiceArray(int arr[]) {
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            int temp = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp)
                    count++;
            }
            if (count == 1)
                return temp;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3};
        int once = singleNumberInTwiceArray(arr);
        System.out.println(once);
    }
}
