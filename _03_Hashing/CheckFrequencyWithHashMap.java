package _03_Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckFrequencyWithHashMap {
    public static void main(String[] args) {
        int arr[] = { 1, 2,2,2,3,3,4,4,5 };

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        System.out.print("Element|Frequency\n");
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.print(e.getKey()+" -> ");
            System.out.println(e.getValue());
        }
    }
}
