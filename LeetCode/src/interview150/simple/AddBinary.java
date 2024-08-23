package interview150.simple;

import java.math.BigInteger;

/**
 * 67. 二进制求和
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
}
