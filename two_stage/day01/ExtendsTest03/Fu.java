package two_stage.day01.ExtendsTest03;

public class Fu {
    int age;
    String name;
//    public Fu() {
//        System.out.println("Fu无参构造方法被调用");
//    }

    public Fu(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Fu带参构造方法被调用");
    }
}
