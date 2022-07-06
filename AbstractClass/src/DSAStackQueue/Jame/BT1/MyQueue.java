package DSAStackQueue.Jame.BT1;

public class MyQueue {

    public int capacity;
    public int[] queurArr;
    public int head;
    public int tail;
    public int currenSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queurArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currenSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isEmpty() {
        boolean status = false;
        if (currenSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("OverFlow! Unable to add element" + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queurArr[tail] = item;
            currenSize++;
            System.out.println("Element " + item + " is push to Queue.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow! Unalble delete element from Dequeue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queurArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queurArr[head - 1]);
            }
            currenSize--;
        }
    }
}
