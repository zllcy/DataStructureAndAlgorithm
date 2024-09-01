package interview150.medium;

/**
 * 172. 阶乘后的零
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        for (int i = 5; i <= n; i += 5) {
            for (int x = i; x % 5 == 0; x /= 5) {
                res++;
            }
        }
        return res;
    }
}
