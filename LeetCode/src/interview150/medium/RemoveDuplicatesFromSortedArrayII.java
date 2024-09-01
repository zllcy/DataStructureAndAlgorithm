package interview150.medium;

/**
 * 80. 删除有序数组中的重复项 II
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int count = 1;
        int len = nums.length;
        int i = 1;
        while (i < len) {
            if (cur == nums[i]) {
                count++;
                if (count > 2) {
                    for (int j = i; j < len - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    len -= 1;
                    count--;
                } else {
                    i++;
                }
            } else {
                count = 1;
                cur = nums[i++];
            }
        }
        return len;
    }
}
