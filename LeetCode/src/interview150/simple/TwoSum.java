package interview150.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = i;
                res[1] = map.get(nums[i]);
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }

        return res;
    }
}
