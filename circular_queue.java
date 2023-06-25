package Queue;

public class circular_queue {
    static class Queue{
        static int [] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static void add(int data){
            if (isFull()){
                System.out.println("queue full");
                return;
            }

            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()){
                return -1;
            }

            int result = arr[front];
            if (rear == front){
                rear = front = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        circular_queue cq = new circular_queue();

    }
}
