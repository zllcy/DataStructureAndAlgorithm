package interview150.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 */
public class Combinations {
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1);
        return res;
    }

    public void backtrack(int cur, int n, int k) {
        // 剪枝：temp 长度加上区间 [cur, n] 的长度小于 k，不可能构造出长度为 k 的 temp
        if (temp.size() + (n - cur + 1) < k) {
            return;
        }
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        // 考虑选择当前位置
        temp.add(cur);
        backtrack(cur + 1, n, k);
        temp.remove(temp.size() - 1);
        // 考虑不选择当前位置
        backtrack(cur + 1, n, k);
    }
}
