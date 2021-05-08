package foundation.myList.impl;

import foundation.myList.IArrayList;

public class ArrayListImpl implements IArrayList {

    private int[] data;
    private int size;

    public ArrayListImpl(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    @Override
    public int capacity() {
        return data.length;
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
    public void add(int element) { //从末尾往里加
//        if (size == data.length) {
//            throw new IllegalArgumentException("数组已满");
//        }
//        data[size] =element;
//        size++;
        add(size, element);
    }

    @Override
    public void add(int index, int element) {
        if (size == data.length) {
            throw new IllegalArgumentException("数组已满");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误（小于0或大于初始化容量");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    @Override
    public boolean contains(int element) { //查：都遍历一遍
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) { //找到元素
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误（小于0或大于初始化容量");
        }
        return data[index];
    }

    @Override
    public void set(int index, int element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误（小于0或大于初始化容量");
        }
        data[index] = element;
    }

    @Override
    public int remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误（小于0或大于初始化容量");
        }
        int res = data[index];

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;

        return res;
    }

    @Override
    public void removeElement(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) { //找到这个元素
            if (data[i] == element) {
                index = i;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("元素不存在");
        }
        remove(index);
    }
}
