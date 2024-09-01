package interview150.medium;

/**
 * 153. 寻找旋转排序数组中的最小值
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
