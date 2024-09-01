package interview150.medium;

/**
 * 238. 除自身以外数组的乘积
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int zeroCount = 0;
        int mul = 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 1) {
            return res;
        }
        if (zeroCount == 1) {
            int zeroIndex = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    mul *= nums[i];
                } else {
                    zeroIndex = i;
                }
            }
            res[zeroIndex] = mul;
            return res;
        }
        for (int i = 0; i < len; i++) {
            mul *= nums[i];
        }
        for (int i = 0; i < len; i++) {
            res[i] = mul / nums[i];
        }
        return res;
    }
}
