package interview150.simple;

/**
 * 35. 搜索插入位置
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        if (target < nums[i]) {
            return i;
        }
        if (target > nums[j]) {
            return j + 1;
        }
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int res = new SearchInsertPosition().searchInsert(nums, target);
        System.out.println(res);
    }
}
