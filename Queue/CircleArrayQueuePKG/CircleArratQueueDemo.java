package Java_data_structur.Queue.CircleArrayQueuePKG;

public class CircleArratQueueDemo {

    public static void main(String[] args) {
        CircleArrayQueue c = new CircleArrayQueue(10);
        c.add(10);
        c.add(20);
        c.exit();

        c.add(30);
        c.exit();

        c.add(30);
        c.exit();

        c.add(30);
        c.add(30);
        c.exit();

        c.add(30);
        c.exit();

        c.add(30);
        c.add(30);
        c.exit();

        c.add(30);
        c.add(30);
        c.exit();

        c.add(30);
        c.add(30);


        System.out.println(c.exit());
        System.out.println("*********************");
        c.show();

    }
}
