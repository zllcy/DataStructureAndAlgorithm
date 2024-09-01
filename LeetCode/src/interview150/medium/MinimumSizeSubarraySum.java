package interview150.medium;

/**
 * 209. 长度最小的子数组
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int res = Integer.MAX_VALUE;
        int subLen = 0;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLen = j - i + 1;
                res = Math.min(res, subLen);
                sum -= nums[i];
                i++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}
