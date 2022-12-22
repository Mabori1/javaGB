package Dz5;

import java.util.HashMap;
import java.util.Objects;

public class Task1 {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();

        for (String str : words1) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }

        for (String str : words2) {
            if (!map1.containsKey(str)) {
                map1.put(str, 1);
            } else {
                map1.put(str, map1.get(str) + 1);
            }
        }

        for (String str : words1) {
            if (Objects.equals(map.get(str), map1.get(str)) && map1.get(str) == 1) {
                count++;
            }
        }
        return count;
    }
}
