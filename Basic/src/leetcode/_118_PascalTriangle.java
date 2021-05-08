package leetcode;
import java.util.List;
import java.util.ArrayList;

/**
 * _118_PascalTriangle
 * 面试中出现的比较少
 * 
 * Example 1:

    Input: numRows = 5
    Output: 
    [
        [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
     ]

    解法：暴力解
    
    newRows = 5
    [1]
    [1,1]
    [1,1,1]=> [1,1+1,1] => [1,2,1]
    [1,2,1]=>[1,1+2,2+1,1] => [1,3,3,1]
    [1,3,3,1]=> 

    time: O(n^2)
    space: O(n)


     Example 2:

    Input: numRows = 1
    Output: [[1]]
 * 
 * 
 * 
 */
public class _118_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(); //外面的大list
        List<Integer> list = new ArrayList<>(); //里面的小list
        for (int i = 0; i < numRows; i++) {
            list.add(0, 1); //[1]
            for (int j = 1; j < list.size() - 1; j++) {  //最后一个数不用算
                list.set(j, list.get(j) + list.get(j + 1)); // 
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}