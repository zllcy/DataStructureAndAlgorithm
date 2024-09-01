package interview150.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. 组合总和
 */
public class CombinationSum {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> combine = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0);
        return res;
    }

    private void backtrack(int[] candidates, int target, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(combine));
            return;
        }
        backtrack(candidates, target, idx + 1);
        if ((target -= candidates[idx]) >= 0) {
            combine.add(candidates[idx]);
            backtrack(candidates, target, idx);
            combine.remove(combine.size() - 1);
        }
    }
}