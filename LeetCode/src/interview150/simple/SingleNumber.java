package interview150.simple;

/**
 * 136. 只出现一次的数字
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
