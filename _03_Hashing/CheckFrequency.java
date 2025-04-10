package _03_Hashing;

public class CheckFrequency {
    static void checkFrequency(int[] arr, int[] feq) {
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == visited) {
                    continue;
                }

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = visited;
                }
            }
            feq[i] = count;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 9, 5, 8, 1, 2, 3 };
        int feq[] = new int[arr.length];

        checkFrequency(arr, feq);
        for (int i = 0; i < feq.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            System.out.println(arr[i] + " " + feq[i]);
        }
    }
}
