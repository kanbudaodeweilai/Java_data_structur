package Java_data_structur.Queue.ArrayQueuePKG;

public class QueueDemo {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(10);
        aq.add(10);
        aq.add(20);
        aq.add(30);
        int a = aq.exit();
        System.out.println(a);
        aq.add(40);
        System.out.println(aq.exit());
        System.out.println("**************");
        aq.show();
    }
}
