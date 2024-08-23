package interview150.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (stringBuilder.length() == 0) {
                stringBuilder.append(nums[i]);
                count++;
            } else if (count == 1) {
                if (nums[i - 1] + 1  == nums[i]) {
                    stringBuilder.append("->" + nums[i]);
                    count++;
                } else {
                    res.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder(String.valueOf(nums[i]));
                    count = 1;
                }
            } else {
                if (nums[i - 1] + 1  == nums[i]) {
                    int preLen = String.valueOf(nums[i - 1]).length();
                    stringBuilder.delete(stringBuilder.length() - preLen, stringBuilder.length() - 1);
                    stringBuilder.append(nums[i]);
                    count++;
                } else {
                    res.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder(String.valueOf(nums[i]));
                    count = 1;
                }
            }
            if (i == nums.length - 1 && stringBuilder.length() != 0) {
                res.add(stringBuilder.toString());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2147483648,-2147483647,2147483647};
        List<String> res = new SummaryRanges().summaryRanges(nums);
        System.out.println(res);
    }
}
