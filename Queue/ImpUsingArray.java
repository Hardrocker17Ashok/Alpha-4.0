package Queue;

public class ImpUsingArray {
    static class QueueImp {
        static int arr[];
        static int size;
        static int rear;

        QueueImp(int val) {
            size = val;
            arr = new int[val];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add element in queue   ->>time complexity is O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove element from queue   ->>time complexity is O(n). we can reduse this complexity by O(1) 
        // using circular queue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }

        // peek element
        // remove element from queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        // print queue
        public static void print() {
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueImp ob = new QueueImp(5);
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.print();
        // remove
        ob.remove();
        ob.remove();
        // again print
        ob.print();
    }
}
