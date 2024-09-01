package interview150.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 373. 查找和最小的 K 对数字
 */
public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(k,
                (o1, o2) -> nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]]);
        List<List<Integer>> res = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < Math.min(m, k); i++) {
            priorityQueue.offer(new int[]{i, 0});
        }
        while (k-- > 0 && !priorityQueue.isEmpty()) {
            int[] idxPair = priorityQueue.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[idxPair[0]]);
            list.add(nums2[idxPair[1]]);
            res.add(list);
            if (idxPair[1] + 1 < n) {
                priorityQueue.offer(new int[]{idxPair[0], idxPair[1] + 1});
            }
        }
        return res;
    }
}
