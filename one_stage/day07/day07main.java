package one_stage.day07;

public class day07main {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.brand="iphone";
        iphone.price=5999;
        System.out.println(iphone.price);
        change(iphone);
        System.out.println(iphone.price);
        iphone.call();
        int num = 10;
        System.out.println(num);
        change(num);
        System.out.println(num);

        iphone.sendMessage();

    }
    public static void change(int a){
        a = 100;
    }
    public static void change(Phone a){
        a.price=100;
    }
}
