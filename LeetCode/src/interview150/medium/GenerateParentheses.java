package interview150.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 */
public class GenerateParentheses {
    List<String> res = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder("(");
    int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        addParenthesis(1, 0);
        return res;
    }

    private void addParenthesis(int leftCount, int rightCount) {
        if (leftCount == n && rightCount == n) {
            res.add(stringBuilder.toString());
            return;
        }
        if (leftCount < n) {
            stringBuilder.append("(");
            leftCount++;
            addParenthesis(leftCount, rightCount);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            leftCount--;
        }
        if (rightCount < leftCount) {
            stringBuilder.append(")");
            rightCount++;
            addParenthesis(leftCount, rightCount);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
