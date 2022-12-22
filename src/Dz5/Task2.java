package Dz5;

import java.util.*;

public class Task2 {
    public List<List<String>> findDuplicate(String[] paths) {

        List<List<String>> resStr = new ArrayList<>();
        Map<String, Set<String>> map = new HashMap<>();

        if (paths == null || paths.length == 0) {
            return resStr;
        }

        for (String path : paths) {
            String[] strs = path.split("\\s+");
            for (int i = 1; i < strs.length; i++) {
                int index = strs[i].indexOf("(");
                String content = strs[i].substring(index);
                String fileName = strs[0] + "/" + strs[i].substring(0, index);
                Set<String> fileNames = map.getOrDefault(content, new HashSet<String>());
                fileNames.add(fileName);
                map.put(content, fileNames);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                resStr.add(new ArrayList<String>(map.get(key)));
            }
        }
        return resStr;
    }
}
