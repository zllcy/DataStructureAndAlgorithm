package interview150.simple;

/**
 * 27. 移除元素
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        while (i < j) {
            if (nums[i] == val && nums[j] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
                k++;
            } else if (nums[i] == val && nums[j] == val) {
                j--;
            } else {
                i++;
                k++;
            }
        }
        if (nums.length > 0 && nums[i] != val) {
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = new RemoveElement().removeElement(nums, val);
        System.out.println(k);
    }
}
