package leetcode;

import java.util.Stack;

public class _678_ValidParenthesisString {
    /**
     *
     * 题目：有效的括号字符串
     *
     * 给定一个只包含三种字符的字符串：（ ，） 和 *，写一个函数来检验这个字符串是否为有效字符串。有效字符串具有如下规则：
     * 任何左括号 ( 必须有相应的右括号 )。
     * 任何右括号 ) 必须有相应的左括号 ( 。
     * 左括号 ( 必须在对应的右括号之前 )。
     * * 可以被视为单个右括号 ) ，或单个左括号 ( ，或一个空字符串。
     * 一个空字符串也被视为有效字符串。
     * ------------------------------------
     *
     * 解法:
     * 1.贪心： space O(1) 面试中不太能想到，很难理解
     *  low: ) 最少必须有多少个 => 因为判断(可以闭合多少个，设 ）的上边界和下边界是多少; low最后必须为0，匹配一个减去一个
     *  high: ) 最多可能有多少 => high为最大值,所以不可能为负数
     *
     *  结论:
     *  1.如果 ( 多, low不为0  => (( )
     *  2.如果 ) 多， high为负数 => （（ ）））
     *
     *
     * 2.Stack： space O(n)
     */


    /**
     * 贪心算法的解法:
     *
     *
     * 例子： ( * ))
     *
     * 遇到 (
     * low = 1
     * high =1
     *
     * 遇到 *
     * low = 1 => 0
     * high =1 => 2
     *
     * 遇到 )
     * low = 0  => 0
     * high = 2 => 1
     *
     * 最后再遇到 )
     * low = 0  => 0 => return true
     * high = 1 => 0
     *
     *
     * time: O(n)
     * space: O(1)
     */

    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                high++;
                low++;
            } else if (c == ')') {
                high--;
                low = Math.max(low - 1, 0); //至少有多少个
            } else { // *
                high++;
                low = Math.max(low - 1, 0);
            }
            if (high < 0) {
                return false;
            }
        }
        return low == 0;
    }

    /**
     * Stack的解法
     * 1.遇见( 放入stack中
     * 2.当遇到 ) 且stack不为空，pop出来
     *
     * 例子： ( * ))
     *
     * 遇到 (
     * stack: (
     * count = 0
     *
     * 遇到 *
     * stack: ( => null
     * count = 0 => 1+1=2
     *
     * 遇到 )
     * stack:
     * count = 2 - 1 = 1
     *
     * 最后遇到 )
     * stack:   => return true
     * count = 1 - 1 = 0
     *
     * time: O(n)
     * space: O(n)
     */
    public boolean chekValidString2(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0; //遇到*记录一次，为了记录可以消掉的()有几对; 当count等于0，stack为空时返回true
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (c == ')' && !stack.isEmpty()) { //()
                    stack.pop();
                } else if (c == ')' && count > 0) { // *)
                    count--;
                } else if (c == ')') { // )
                    return false;
                } else { //遇到 *
                    count++;
                    if (!stack.isEmpty()) { // ( * ) )
                        stack.pop();
                        count++;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
