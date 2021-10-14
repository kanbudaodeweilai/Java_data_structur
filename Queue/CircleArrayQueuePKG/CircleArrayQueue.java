package Java_data_structur.Queue.CircleArrayQueuePKG;

public class CircleArrayQueue {
    private int front;
    private int rear;
    private int maxSize;
    private int[] arr;

    public CircleArrayQueue(int MaxSize){
        maxSize=MaxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }
    public boolean isEmputy(){
        if (rear==front){
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
        if ((rear+1)%maxSize==front){
            return true;

        }else {
            return false;
        }
    }
    public void add(int a){
        if (isFull()){
            System.out.println("队列已满");
        }else {
            arr[rear] = a;
            rear = (rear+1)%maxSize;
        }
    }
    public int exit(){
        if (isEmputy()){
            throw new RuntimeException("队列为空，无法出队");
        }else {
            int a = arr[front];
            front = (front+1)%maxSize;
            return a;
        }
    }
    public void show(){
        if (isEmputy()){
            System.out.println("队列为空");
        }else {
            for (int i =front;i<rear;i++){
                System.out.println(arr[i]);
            }
        }
    }








}
