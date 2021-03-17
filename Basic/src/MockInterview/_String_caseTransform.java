package MockInterview;

import java.util.Scanner;

public class _String_caseTransform {
    /**
     * 企业原题：Shopee
     * 题目：字符串命名转换
     *
     * 孔乙己说“回”字有四种写法，编程语言中常见的命名风格有如下四种：
     *
     * 全部首字母大写
     * 第一个单词首字母小写，其余单词首字母大写
     * 单词全部小写，由下划线连接
     * 单词全部小写，由减号连接
     * 请设计并实现一个caseTransform函数，使得一个字符串str可以被方便地转成四种形式，并且将四种形式通过空格拼接成一个字符串返回
     * 为方便起见，这里假设输入字符串全部符合以上四种形式的英文字母组合
     *
     * 输入描述:
     * PascalCaseTest
     *
     * 输出描述:
     * PascalCaseTest pascalCaseTest pascal_case_test pascal-case-test
     * ————————————————
     *
     * 思路：
     * 1. 根据特点堆字符串进行切割
     * 2. 将首个切割片段的首字母转换为小写字母并拼接 => 得到第二个答案
     * 3. 将剩余切割片段的首字母转为大写并拼接
     */


    /**
     * 例子：PascalCaseTest
     *
     * PascalCaseTest
     * sc
     * ---- Step1 ----
     * start = 0
     * i = 1
     * c = P
     * ans0: P
     * ans1: p
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the caseTransform:");
            String s = scanner.next();
            int start = 0;
            StringBuilder ans0 = new StringBuilder();
            StringBuilder ans1 = new StringBuilder();

            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((c >= 'A' && c <= 'Z') || c == '-' || c == '_') {
                    ans0.append(Character.toUpperCase(s.charAt(start))).append(s, start + 1, i); //Pascal PascalCase
                    ans1.append(Character.toLowerCase(s.charAt(start))).append(s, start + 1, i).append('_'); //pascal_  pascal_case_
                    start = i;
                    if (c == '-' || c == '_')
                        start++;
                }
            }
            String s1 = ans0.append(Character.toUpperCase(s.charAt(start))).append(s, start + 1, s.length()).toString(); //PascalCaseTest
            String s2 = ans1.append(Character.toLowerCase(s.charAt(start))).append(s, start + 1, s.length()).toString(); //pascal_case_test


            System.out.print(s1 + " "); //PascalCaseTest
            System.out.print(s1.substring(0, 1).toLowerCase() + s1.substring(1) + " "); //p + ascalCaseTest => pascalCaseTest
            System.out.print(s2+" "); //pascal_case_test
            System.out.println(s2.replaceAll("_", "-")); // pascal-case-test

        }
}
