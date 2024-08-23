package interview150.simple;

/**
 * 242. 有效的字母异位词
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int len = s.length();
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        for (int i = 0; i < len; i++) {
            sArr[s.charAt(i) - 'a'] += 1;
            tArr[t.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }
}
