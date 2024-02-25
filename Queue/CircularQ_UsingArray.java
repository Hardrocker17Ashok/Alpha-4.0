package Queue;

public class CircularQ_UsingArray {
    static class QueueImp {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        QueueImp(int val) {
            size = val;
            arr = new int[val];
            rear = front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add element in queue ->>time complexity is O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove element from queue ->>time complexity is O(1).
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        // peek element
        // remove element from queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // print queue
        // public static void print() {
        // for (int i = (front+1)%size; i < (rear+1)%size; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // }
    }

    public static void main(String[] args) {
        QueueImp ob = new QueueImp(5);
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        System.out.println(ob.peek());
        System.out.println(ob.remove());
        System.out.println(ob.remove());
        ob.add(30);
        ob.add(40);
        // again print
        System.out.println(ob.peek());
    }
}
