package sortAlgorithm;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] nums) {
        for (int i = (nums.length - 1) / 2; i >= 0; i--) { //所有叶子节点的数量 = 所有节点数/2 = n/2
            heapAdjust(nums, i, nums.length);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i); //一开始最后一个节点和头结点交换位置
            heapAdjust(nums, 0, i);
        }
    }
    //最大堆：大 ... 不一定 ....
    //和 siftDownHeapify 逻辑基本一致
    public static void heapAdjust(int[] nums, int start, int length) {
        int child = 2 * start + 1;
        while (child < length) {
            if (child + 1 < length && nums[child] < nums[child + 1]) {
                child++;
            }
            if (nums[start] < nums[child]) {
                swap(nums, start, child);
            } else {
                break;
            }
            start = child;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 23, 30, 8, 32, 31, 41, 1, 15};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}

