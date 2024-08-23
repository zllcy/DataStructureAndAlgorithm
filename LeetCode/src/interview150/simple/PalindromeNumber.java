package interview150.simple;

/**
 * 9. 回文数
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = 0;
        int j = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
