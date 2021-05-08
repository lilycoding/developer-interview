package MockInterview;
import java.util.*;

public class _290_WordPattern {

    /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param pattern string字符串
         * @param str string字符串
         * @return bool布尔型
         */

    /**
     * 思路：
     * HashMap: 对应关系
     * key: pattern中的每个不同的字母 共256个
     * value：str中的每个不同单词
     * 步骤：
     * 1. 空格分割单词
     * 2. 放入map中找一一对应关系
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O（1）
     */



        public boolean testMatch (String pattern, String str) {
            // write code here
            String[] arr = str.split(" ");
            if (arr.length != pattern.length()) {
                return false;
            }
            HashMap<Character, String> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                char c = pattern.charAt(i); //pattern中字母
                if (map.containsKey(c)) {
                    if (map.get(c).equals(arr[i])) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    if (!map.containsValue(arr[i])) {
                        map.put(c, arr[i]);
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }


