package leetCode.heap.kthLargestElementInStream;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MinHeap {
    private ArrayList<Integer> data;

    public MinHeap() {
        this.data = new ArrayList<>();
    }

    public void push(int value) {
        data.add(value);
        siftUp(data.size() - 1);
    }

    public int peek() {
        if (data.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        return data.get(0);
    }

    public int pop() {
        if (data.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        int root = data.get(0);
        int lastElement = data.remove(data.size() - 1);

        if (!data.isEmpty()) {
            data.set(0, lastElement);
            siftDown(0);
        }
        return root;
    }

    public int size() {
        return data.size();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int p = parent(index);
            if (data.get(index) < data.get(p)) {
                swap(index, p);
                index = p;
            } else {
                break;
            }
        }
    }

    private void siftDown(int index) {
        int half = data.size() / 2;
        while (index < half) {
            int left = leftChild(index);
            int right = rightChild(index);
            int smallest = left;

            if (right < data.size() && data.get(right) < data.get(left)) {
                smallest = right;
            }

            if (data.get(index) <= data.get(smallest)) {
                break;
            }

            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }
}