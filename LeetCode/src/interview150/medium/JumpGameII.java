package interview150.medium;

/**
 * 45. 跳跃游戏 II
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int len = nums.length;
        int end = 0;
        int reach = 0;
        int steps = 0;
        for (int i = 0; i < len - 1; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (i == end) {
                end = reach;
                steps++;
            }
        }
        return steps;
    }
}
