package interview150.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            String s = String.valueOf(n);
            char[] charArray = s.toCharArray();
            n = 0;
            for (char c : charArray) {
                Integer val = Integer.valueOf(String.valueOf(c));
                n += val * val;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean res = new HappyNumber().isHappy(n);
        System.out.println(res);
    }
}
