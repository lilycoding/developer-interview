package leetcode;

public class _13_RomantoInteger {
    /**
     * 13. Roman to Integer
     * Given a roman number, covert it to an integer.
     *
     * Input is guaranteed to be within the range from 1 to 3999.
     *
     * 规律：左边的数字如果小于右边的数字 = 右边 - 左边
     * 例子： IV -> 4   5-1=6
     *
     * IX -> 1/10 10-1=9
     *       1+10-2*1=9
     *
     * time: O(n) 因为遍历一次;
     * space: O(1) 没有开辟额外空间;
     *
     * 思路：
     * 1.遍历string s，每一位转换成10进制数
     * 2.相加，如果遇到左边数小于右边：右边-左边
     */

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        int res = toNumber(s.charAt(0)); //取出第一个
        for (int i = 1; i < s.length(); i++) {
            if (toNumber(s.charAt(i)) > toNumber(s.charAt(i - 1))) { // IV: 1 < 5 => 4
                res += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i - 1)); // res = ..I + I + V 这边多加了一个I，所以需要减去I => 1+5-2*1=4
            } else {
                res += toNumber(s.charAt(i));  // XII:10+1+1=12
            }
        }
        return res;
    }

    public static int toNumber(char c) {
        int res = 0;
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return res;
    }
}
