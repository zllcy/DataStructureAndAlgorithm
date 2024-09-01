package interview150.medium;

/**
 * 12. 整数转罗马数字
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        String[] str = {"I", "V", "X", "L", "C", "D", "M"};
        int i = 0;
        do {
            int n = num % 10;
            switch (n) {
                case 1:
                    builder.insert(0, str[i]);
                    break;
                case 2:
                    builder.insert(0, str[i] + str[i]);
                    break;
                case 3:
                    builder.insert(0, str[i] + str[i] + str[i]);
                    break;
                case 4:
                    builder.insert(0, str[i] + str[i + 1]);
                    break;
                case 5:
                    builder.insert(0, str[i + 1]);
                    break;
                case 6:
                    builder.insert(0, str[i + 1] + str[i]);
                    break;
                case 7:
                    builder.insert(0, str[i + 1] + str[i] + str[i]);
                    break;
                case 8:
                    builder.insert(0, str[i + 1] + str[i] + str[i] + str[i]);
                    break;
                case 9:
                    builder.insert(0, str[i] + str[i + 2]);
                    break;
                default:
                    break;
            }
            i = i + 2;
            num = num / 10;
        } while (num > 0);

        return builder.toString();
    }
}
