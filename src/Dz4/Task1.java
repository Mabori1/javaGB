package Dz4;

import java.util.ArrayDeque;

public class Task1 {
    public String simplifyPath(String path) {

        if (path == null || path.length() == 0) {
            return path;
        }

        String result = "";

        String[] array = path.split("/");
        ArrayDeque<String> stack = new ArrayDeque<>();

        int i = 0;
        while (i < array.length) {

            if (array[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!array[i].equals(".") && !array[i].equals("")) {
                stack.push(array[i]);
            }

            i++;
        }

        if (stack.isEmpty()) return "/";

        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }

        return result;
    }
}
