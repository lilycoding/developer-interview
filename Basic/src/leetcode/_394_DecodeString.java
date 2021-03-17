package leetcode;

import java.util.Stack;

public class _394_DecodeString {
    /**
     * 394. Decode String
     *
     * 技能点:
     * Stack / Depth-first Search
     *
     * 思路：
     * 1. 从内往外写 => 符合stack特征先进后出；后进先出
     * 2. 带括号的大部分都可用stack做
     *
     * Example 1:
     * Input: s = "3[a]2[bc]"
     * Output: "aaabcbc"
     *
     * Example 2:
     * Input: s = "3[a2[c]]"
     * Output: "accaccacc"
     *
     * Example 3:
     * Input: s = "2[abc]3[cd]ef"
     * Output: "abcabccdcdcdef"
     *
     *
     * time:O(n);
     * space: O(n);
     *
     *
     */


    public String decodeString(String s) {
        if (s == null || s.length() == 0) return s;
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            //包含字符类型有：数字、字母、中括号左右
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) { //32  => count = 0 * 10 + 3  => count = 3*10+2=32
                    count = count * 10 + (s.charAt(idx) - '0');
                }
                countStack.push(count);
            } else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            } else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder(resStack.pop());
                int time = countStack.pop();
                for (int i = 0; i < time; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            } else { //字母
                res += s.charAt(idx++);
            }
        }
        return res;
    }



}
/**
 *
 * countStack: 记录每个字母重复次数
 *
 *
 *
 * 例子：
 *
 * 3[a2[c]] => accaccacc
 * 遇到3
 * countStack: 3
 * resStack:
 * res: ""
 *
 * 遇到【
 * countStack: 3
 * resStack: ""
 * res: ""
 *
 * 遇到a
 * countStack: 3
 * resStack: ""
 * res: a
 *
 * 遇到2
 * countStack: 3  2
 * resStack: ""
 * res: a
 *
 * 遇到 [
 * countStack: 3  2
 * resStack: "" a
 * res: ""
 *
 * 遇到 c
 * countStack: 3  2
 * resStack: "" a
 * res: c
 *
 * 遇到 ]
 * resStack.pop()=a => temp
 * temp = a => ac => acc
 * countStack.pop()=2 => time
 * time = 2
 * countStack: 3
 * resStack: ""
 * res: c => acc
 *
 * 最后再遇到 ]
 * resStack.pop()="" => temp
 * temp = acc"" => acc + "" + acc + acc
 * countStack.pop()=3 => time
 * time = 3
 * countStack:
 * resStack:
 * res: accaccacc
 */
