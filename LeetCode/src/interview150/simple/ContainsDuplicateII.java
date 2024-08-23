package interview150.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. 存在重复元素 II
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                Integer j = map.get(n);
                if (Math.abs(i - j) <= k) {
                    return true;
                }
            }
            map.put(n, i);
        }
        return false;
    }
}
