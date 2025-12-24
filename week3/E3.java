class MyCircularQueue {

    int[] queue;
    int front;
    int rear;
    int k;

    public MyCircularQueue(int k) {
        this.k = k;
        queue = new int[k];
        front = 0;
        rear = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;

        queue[rear] = value;
        rear = (rear + 1) % k;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;

        front = (front + 1) % k;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[(rear - 1 + k) % k];
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return (rear + 1) % k == front;
    }
}
