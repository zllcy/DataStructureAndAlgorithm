package interview150.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. 最长连续序列
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int seqLen = 1;
                while (set.contains(curNum + 1)) {
                    curNum += 1;
                    seqLen += 1;
                }
                res = Math.max(res, seqLen);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        int res = new LongestConsecutiveSequence().longestConsecutive(nums);
        System.out.println(res);
    }
}
