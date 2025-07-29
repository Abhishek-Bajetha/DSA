package _07_String.Basic;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char key = s.charAt(i);
            char value = t.charAt(i);

            if (!map.containsKey(key)) {
                if (!map.containsValue(value)) {
                    map.put(key, value);
                } else {
                    return false;
                }
            } else {
                char check = map.get(key);
                if (check != value) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
