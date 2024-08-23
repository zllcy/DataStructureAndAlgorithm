package interview150.simple;

import java.util.Arrays;

/**
 * 169. 多数元素
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len / 2];
    }
}
