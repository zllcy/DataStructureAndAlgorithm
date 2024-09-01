package interview150.medium;

/**
 * 6. Z 字形变换
 */
public class IgzagConversion {
    public String convert(String s, int numRows) {
        if(s == null || numRows == 1) {
            return s;
        }
        StringBuilder[] array = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            array[i] = new StringBuilder();
        }
        int dir = 1;
        int index = 0;
        char[] c = s.toCharArray();
        for(char ch : c) {
            array[index].append(ch);
            index += dir;
            if(index == 0 || index == numRows - 1) {
                dir = -dir;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            stringBuilder.append(array[i]);
        }

        return stringBuilder.toString();
    }
}
