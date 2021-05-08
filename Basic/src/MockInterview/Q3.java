package MockInterview;

import java.util.HashMap;

public class Q3 {
    /**
     *
     * @param A int整型一维数组
     * @param T int整型
     * @return int整型
     */

    /**
     * 例子:
     *  0 1 2 3 4 5
     * [2,3,1,2,4,3]  T=7
     * sum = 8 前面数相加  left = 0
     *
     */
    public int minSumOfLengths (int[] A, int T) {
        int res = Integer.MAX_VALUE;
        int left = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            while (left <= i && sum == T) {
                res = Math.min(res, i - left + 1);
                sum -= A[left++];
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
