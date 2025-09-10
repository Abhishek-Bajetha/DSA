package _05_Arrays.Medium;

import java.util.ArrayList;

public class LeadersInArray {
    public static ArrayList<Integer> leadersInArray(int[] arr) {
        int n = arr.length - 1, maxi = Integer.MIN_VALUE;
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = n; i >= 0; i--) {
            if (maxi < arr[i]) {
                leaders.add(arr[i]);
                maxi = arr[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> leaders = leadersInArray(arr);
        for (Integer i : leaders) {
            System.out.println(i);
        }
    }
}
