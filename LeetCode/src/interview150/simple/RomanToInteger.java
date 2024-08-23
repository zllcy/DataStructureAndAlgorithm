package interview150.simple;

/**
 * 13. 罗马数字转整数
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int len = c.length;
        int[] a = new int[len];
        int res = 0;
        for (int i = 0; i < len; i++) {
            switch (c[i]) {
                case 'I':
                    a[i] = 1;
                    break;
                case 'V':
                    a[i] = 5;
                    break;
                case 'X':
                    a[i] = 10;
                    break;
                case 'L':
                    a[i] = 50;
                    break;
                case 'C':
                    a[i] = 100;
                    break;
                case 'D':
                    a[i] = 500;
                    break;
                case 'M':
                    a[i] = 1000;
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < len; i++) {
            if ((a[i] == 1 && a[i + 1] == 5) || (a[i] == 1 && a[i + 1] == 10)
                    || (a[i] == 10 && a[i + 1] == 50) || (a[i] == 10 && a[i + 1] == 100)
                    || (a[i] == 100 && a[i + 1] == 500) || (a[i] == 100 && a[i + 1] == 1000)) {
                a[i + 1] = a[i + 1] - a[i];
                a[i] = 0;
            }
        }

        for (int i = 0; i < len; i++) {
            res += a[i];
        }

        return res;
    }
}
