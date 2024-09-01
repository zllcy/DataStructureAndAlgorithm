package interview150.medium;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = binarySearchFirst(nums, target);
        res[1] = binarySearchLast(nums, target);
        return res;
    }

    private int binarySearchFirst(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int mid = 0;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] < nums[mid])) {
                return mid;
            } else if (nums[mid] >= target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            }
        }
        return -1;
    }

    private int binarySearchLast(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int mid = 0;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > nums[mid])) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] <= target) {
                i = mid + 1;
            }
        }
        return -1;
    }
}
