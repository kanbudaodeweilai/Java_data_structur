package two_stage.day02.Interface02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        接口默认为常量
//        Inter.num = 20;
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
    }
}
