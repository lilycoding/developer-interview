package impl;

import heap.IMaxHeap;

public class MaxHeapImpl<E extends Comparable<E>> implements IMaxHeap<E> {

    private int capacity;
    private int size;
    private E[] data;


    public MaxHeapImpl(E[] data) {
        this.capacity = data.length;
        this.size = data.length;
        this.data = data;
    }

    public MaxHeapImpl() {
        this.capacity = 16;
        this.size = 0;
        this.data = (E[]) new Comparable[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean offer(E e) { //插入
        if (data.length == size) {
            expandCapacity(); //扩容
        }
        data[size] = e;
        size++;
        siftUp(); //增加一个节点
        return true;
    }

    @Override
    public E poll() { //删除
        if (size == 0) {
            throw new IllegalArgumentException("堆为空");
        }
        E item = data[0];
        data[0] = data[size - 1];
        data[size - 1] = null;
        size--;
        siftDown();
        return item;
    }

    @Override
    public E peek() { //查看栈顶
        if (size == 0) {
            throw new IllegalArgumentException("堆为空");
        }
        return data[0];
    }

    @Override
    public void print() {

    }

    private void expandCapacity() {
        E[] temp = (E[]) new Comparable[capacity *  2];
        for (int i = 0;i < capacity; i++) {
            temp[i] = data[i];
        }
        capacity *= 2;
        data = temp;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;  //头部从0开始
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private E leftChild(int index) {
        return data[getLeftChildIndex(index)];
    }

    private E rightChild(int index) {
        return data[getRightChildIndex(index)];
    }

    private E parent(int index) {
        return data[getParentIndex(index)];
    }

    private void swap(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private void siftUp() {
        int index = size - 1; //放在最后一个位置
        while (getParentIndex(index) >= 0 && parent(index).compareTo(data[index]) < 0) { //上面父节点小于子节点再交换
            swap(getParentIndex(index), index);
            index = getParentIndex(index); //index指向一个新的位置
        }
    }

    private void siftDown() { //假设最后一个元素已经放在头部了
        int index = 0;
        while (getLeftChildIndex(index) < size) {
            int biggerChildIndex = getLeftChildIndex(index);
            if (getRightChildIndex(index) < size && rightChild(index).compareTo(leftChild(index)) > 0) {
                biggerChildIndex = getRightChildIndex(index);
            }
            if (data[index].compareTo(data[biggerChildIndex]) > 0) {
                break;
            } else {
                swap(index, biggerChildIndex);
            }
            index = biggerChildIndex;
        }
    }
}


















