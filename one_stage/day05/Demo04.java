package one_stage.day05;

public class Demo04 {
    public static void main(String[] args) {
        int a = 10;
        byte b = 1;
        double c = 10.1;
        long d = 12;
        compare(a);
        compare(b);
        compare(c);
        compare(d);


    }
    public static void compare(int a){
        System.out.println("int");
    }
    public static void compare(byte a){
        System.out.println("byte");
    }
    public static void compare(double a){
        System.out.println("double");
    }
    public static void compare(long a){
        System.out.println("long");
    }
}
