package _05_Arrays.Hard;

import java.util.HashMap;

public class CountSubarraysWithGivenXor {
    public static int countSubarraysWithGivenXor(int[] arr, int target) {

        int n = arr.length;
        int xr = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xr, 1);

        for (int i = 0; i < n; i++) {

            xr = xr ^ arr[i];
            int x = xr ^ target;

            if (map.containsKey(x)) {
                count += map.get(x);
            }
            
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
             
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int target = 6;
        System.out.println(countSubarraysWithGivenXor(arr, target));
    }
}