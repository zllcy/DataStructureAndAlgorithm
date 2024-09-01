package interview150.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 150. 逆波兰表达式求值
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if ("+".equals(token)) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 + n1);
            } else if ("-".equals(token)) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 - n1);
            } else if ("*".equals(token)) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 * n1);
            } else if ("/".equals(token)) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 / n1);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
