package interview150.medium;

/**
 * 189. 轮转数组
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] rotate = new int[len];
        int j = 0;
        k = k % len;
        for (int i = len - k; i < len; i++) {
            rotate[j++] = nums[i];
        }
        for (int i = 0; i < len - k; i++) {
            rotate[j++] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = rotate[i];
        }
    }
}
