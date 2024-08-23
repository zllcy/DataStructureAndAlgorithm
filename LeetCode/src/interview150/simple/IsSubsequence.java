package interview150.simple;

/**
 * 392. 判断子序列
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int sLen = s.length();
        int tLen = t.length();
        if (sLen > tLen) {
            return false;
        }
        while (i < sLen && j < tLen) {
            char schar = s.charAt(i);
            char tchar = t.charAt(j);
            if (schar == tchar) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i != sLen) {
            return false;
        }
        return true;
    }
}
