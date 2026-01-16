package DaaPracTanisha;
import java.util.Arrays;

public class BinaryHeap {

private int[] heap;
private int size;
private int maxSize;

public BinaryHeap(int capacity) {
    maxSize = capacity;
    size = 0;
    heap = new int[maxSize + 1];
}

private void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
}

private void heapify(int index) {
    int largest = index;
    int leftChild = 2 * index;
    int rightChild = 2 * index + 1;

    if (leftChild <= size && heap[leftChild] > heap[largest]) {
        largest = leftChild;
    }

    if (rightChild <= size && heap[rightChild] > heap[largest]) {
        largest = rightChild;
    }

    if (largest != index) {
        swap(index, largest);
        heapify(largest);
    }
}

public void insert(int value) {
    if (size == maxSize) {
        System.out.println("Heap is full, cannot insert more values");
        return;
    }

    size++;
    heap[size] = value;
    int current = size;

    while (heap[current] > heap[current / 2]) {
        swap(current, current / 2);
        current = current / 2;
    }
}

public void printHeap() {
    System.out.println("Heap elements: " + Arrays.toString(Arrays.copyOfRange(heap, 1, size + 1)));
}

public static void main(String[] args) {
    BinaryHeap heap = new BinaryHeap(10);
    heap.insert(10);
    heap.insert(20);
    heap.insert(15);
    heap.insert(30);
    heap.insert(40);

    heap.printHeap();
}
}