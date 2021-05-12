package foundation.sortAlgorithm;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    /**
     * 时间复杂度
     * 最好：O(n^2)
     * 最坏：n+(n-1)+(n-2)...+0 = O(n^2)
     * 平均：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性： 不稳定
     * @param nums
     */
    public static void selectSort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(nums));
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
            System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(nums));
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        selectSort(nums);
    }
}
