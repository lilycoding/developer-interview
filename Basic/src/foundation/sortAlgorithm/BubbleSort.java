package foundation.sortAlgorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 时间复杂度
     * 最好：O(n)
     * 最坏：n+(n-1)+(n-2)...+0 = O(n^2)
     * 平均：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性： 稳定
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) { //每次循环第一个数确定位置
            System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(nums));
            for (int j = nums.length - 1; j > i; j--) { //从后往前判断交换
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(nums));
            }
        }
    }

    public static void bubbleSortBest(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) { //每次循环第一个数确定位置
            flag = false;
            System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(nums));
            for (int j = nums.length - 1; j > i; j--) { //从后往前判断交换
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = true;
                }
                System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(nums));
            }
            if (!flag) { //整体for循环都没有进行交换，证明排好序了
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6};
//        bubbleSort(nums2);
        bubbleSortBest(nums2);
    }
}
