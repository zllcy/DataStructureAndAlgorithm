package interview150.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词规律
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] t = s.split(" ");
        if (pattern.length() != t.length) return false;
        Map<Character, String> p2t = new HashMap<>();
        Map<String, Character> t2p = new HashMap<>();
        int len = t.length;
        for (int i = 0; i < len; i++) {
            char x = pattern.charAt(i);
            String y = t[i];
            if ((p2t.containsKey(x) && !p2t.get(x).equals(y)) || (t2p.containsKey(y) && !t2p.get(y).equals(x))) {
                return false;
            }
            p2t.put(x, y);
            t2p.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean res = new WordPattern().wordPattern(pattern, s);
        System.out.println(res);
    }
}
