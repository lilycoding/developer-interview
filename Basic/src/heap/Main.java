package heap;

import heap.impl.MaxHeapImpl;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        MaxHeapImpl<Integer> maxHeap = new MaxHeapImpl<>();
        Integer[] nums = new Integer[]{2, 23, 30, 8, 32, 31, 41, 1, 15};
        /**
         * nlogn
         */
        for (Integer num: nums) {
            maxHeap.offer(num); //插入
        }
//        maxHeap.print();

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        for (Integer num: nums) {
//            priorityQueue.offer(num); //加入
//        }
//        System.out.println(priorityQueue.poll());//删除，出栈； 打印出优先级最小的 => 1
//        System.out.println(priorityQueue.poll()); //2å

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>((a,b)-> (a.score - b.score)); //从xiao
    }

    class Student {
        int score;
    }
}
