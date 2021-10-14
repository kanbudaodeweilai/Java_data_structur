package Java_data_structur.Queue.ArrayQueuePKG;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int arrMaxSize){
       maxSize = arrMaxSize;
       arr = new int[arrMaxSize];
       front = -1;
       rear = -1;

    }
    public void add(int a){
        if (rear == maxSize-1){
            System.out.println("队列已满");
        }else{
            rear = rear+1;
            arr[rear]=a;
        }
    }
    public int exit(){
        if (front==rear){
            throw new RuntimeException("队列为空，无法出队");
        }else {
            front = front+1;
            int a = arr[front];

            return a;
        }
    }
    public void show(){
        if (front==rear){
            System.out.println("队列为空");
        }else {
            for (int i =front+1;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public void clear(){
        front=-1;
        rear = -1;

    }
}
