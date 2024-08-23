package interview150.simple;

/**
 * 58. 最后一个单词的长度
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int res = new LengthOfLastWord().lengthOfLastWord(s);
        System.out.println(res);
    }
}
