package interview150.medium;

import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
