package two_stage.day01.StaticTest01;

public class StaticDemo01 {
    public static int age ;
    public static String name;
    public int age1;
    public String name1;
    public void show(){
        age = 10;
        name = "asdasd";
        age1 = 11;
        name1 = "llkhjk";
    }
    public static void method(){
        age = 1;
        name = "asdasd";
//        静态只能访问静态，但是非静态可以访问静态也可以访问非静态
//        age1 = 10;
//        name1 = "asdasw";
    }

}
