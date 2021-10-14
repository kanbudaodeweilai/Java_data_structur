package one_stage.day05;
/**
*    Demo03 class function description.
*    方法重载
*   多个方法在同一个类中
*   多个方法具有相同的方法名
*   多个方法的参数不相同，类型不同或者数量不同
*   与返回值无关
*/
public class Demo03 {
    public static void main(String[] args) {
        sum(20,30);
        sum(23,55,123);
    }
    public static void sum(int a,int b){
        System.out.println("a+b="+(a+b));

    }
    public static void sum(int a,int b ,int c){
        System.out.println("a+b+c="+(a+b+c));
    }
}
