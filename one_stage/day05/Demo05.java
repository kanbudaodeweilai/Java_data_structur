package one_stage.day05;

public class Demo05 {
    public static void main(String[] args) {
        int num = 10;
        int[] a = {1,2,3,4,5,6,87,15};
        System.out.println(num);
        System.out.println(a[2]);
        change(num);
        change(a);
        System.out.println(num);
        System.out.println(a[2]);


    }
    public static void change(int num ){
        num = num+10;

    }
    public static void change(int[] a){
        a[2]=88;

    }
}
