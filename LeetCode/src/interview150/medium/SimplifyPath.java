package interview150.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 71. 简化路径
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();
        String[] strs = path.split("/");
        for (String str : strs) {
            if (".".equals(str) || "".equals(str)) {
                continue;
            }
            if ("..".equals(str)) {
                deque.pollLast();
            } else {
                deque.offer(str);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!deque.isEmpty()) {
            stringBuilder.append("/" + deque.poll());
        }

        if ("".equals(stringBuilder.toString())) return "/";
        return stringBuilder.toString();
    }
}
