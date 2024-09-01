package interview150.medium;

/**
 * 151. 反转字符串中的单词
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (!"".equals(strs[i])) {
                stringBuilder.append(strs[i]).append(" ");
            }
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        String res = new ReverseWordsInAString().reverseWords(s);
        System.out.println(res);
    }
}
