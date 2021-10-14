package two_stage.day04.API01;


public class APITest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i =1;i<1001;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long time = end-start;

        System.out.println(time);
    }
}
