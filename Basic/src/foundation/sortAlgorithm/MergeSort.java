package foundation.sortAlgorithm;

import java.util.Arrays;

/**
 * 合并排序
 */
public class MergeSort {
    /**
     * 时间复杂度
     * 最好：O(nlogn)
     * 最坏：O(nlogn)
     * 平均：O(nlogn)
     * 空间复杂度：O(n)
     * 稳定性： 稳定
     * @param nums
     */
    public static int[] mergeSort(int[] nums, int low, int high) {
        int mid = (low + high) / 2; //分解
        if (low < high) {
            mergeSort(nums, low, mid); //解决
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high); //合并
        }
        return nums;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; //一共有多少数
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            nums[x + low] = temp[x];
        }
        System.out.println("当前排序结果：" + Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        mergeSort(nums, 0, nums.length - 1);
    }
}
