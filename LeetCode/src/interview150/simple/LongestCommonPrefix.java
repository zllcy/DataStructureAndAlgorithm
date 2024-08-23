package interview150.simple;

import java.util.Arrays;

/**
 * 14. 最长公共前缀
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                stringBuilder.append(first.charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
