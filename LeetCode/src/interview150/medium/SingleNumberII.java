package interview150.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 137. 只出现一次的数字 II
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (count == 1) {
                res = num;
                break;
            }
        }
        return res;
    }
}
