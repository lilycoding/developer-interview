package heap.impl;

public class _41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        //边界条件
        if (nums == null || nums.length == 0) {
            return 1;
        }
        //遍历一遍交换数字： 对应的数字放入对应的位置
        //index 0 1  2  3
        //nums  3 4 -1  2
        //nums[0]=>3  nums[3-1]=-1   不相等且在范围内就要交换
        for (int i = 0; i < nums.length; i++) {
             while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
             }
        }

        //再遍历一遍，看交换后对应的位置上是不是应该有的数字
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
