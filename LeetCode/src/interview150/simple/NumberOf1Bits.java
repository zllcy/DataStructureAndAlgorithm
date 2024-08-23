package interview150.simple;

/**
 * 191. 位1的个数
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                res++;
            }
            n /= 2;
        }
        return res;
    }
}
