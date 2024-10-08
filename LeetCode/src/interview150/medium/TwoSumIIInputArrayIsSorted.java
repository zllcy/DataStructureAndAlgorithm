package interview150.medium;

/**
 * 167. 两数之和 II - 输入有序数组
 */
public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}
