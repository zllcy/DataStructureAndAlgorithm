package interview150.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 */
public class Permutations {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        addNum(used, nums);
        return res;
    }

    private void addNum(boolean[] used, int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            addNum(used, nums);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
