package foundation.sortAlgorithm;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    /**
     * 时间复杂度
     * 最好：O(nlogn) 每次取一半
     * 最坏：O(n^2)   5 4 3 2 1
     * 平均：O(nlogn)
     * 空间复杂度：O(logn ~ n)
     * 稳定性： 不稳定
     * @param nums
     * @param left
     * @param right
     */
    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }
    }

    public static int partition(int[] nums, int left, int right) {
        int pivotIndex = left;
        int pivot = nums[pivotIndex];
        int l = left + 1;
        int r = right;
        System.out.println("pivot：" + pivot + " " + Arrays.toString(nums));
        System.out.println("pivotIndex :" + pivotIndex + " " + "l, r :" + l + " " + r);
        while ( l <= r) {
            if (nums[l] > pivot && nums[r] < pivot) {
                swap(nums, l++, r--);
            }
            if (nums[l] <= pivot) l++;
            if (nums[r] >= pivot) r--;
            System.out.println("当前结果"  + Arrays.toString(nums));
        }
        swap(nums, pivotIndex, r);
        System.out.println("此轮结束：" + Arrays.toString(nums));
        return r;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 4, 7, 6, 1, 3, 8};
        quickSort(nums, 0, nums.length - 1);
    }
}
