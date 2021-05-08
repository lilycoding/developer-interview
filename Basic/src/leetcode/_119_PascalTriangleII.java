package leetcode;
import java.util.List;
import java.util.ArrayList;

/**
 * _119_PascalTriangleII
 * 
 * 118 是返回整个list
 * 119 是只需要返回最后一行的list
 * 
 * time: O(n^2)
 * space: O(n)
 * 
 * Input: rowIndex = 0
    Output: [1]
 * 
 * 例子：
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *    [1,3,3,1],
 *    [1,4,6,4,1]
 * ]
 */
public class _119_PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex < 0)
            return res;

        for (int i = 0; i < rowIndex + 1; i++) { //index从0开始，只有+1，才会返回正确的位置
            //以下算出内部每个小list的部分和118一致
            res.add(0, 1);
            for (int j = 1; j < res.size() - 1; j++) {
                res.set(j, res.get(j) + res.get(j + 1));
            }
        }    
        return res;
    }
}