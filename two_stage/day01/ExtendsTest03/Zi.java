package two_stage.day01.ExtendsTest03;

public class Zi extends Fu{
    int age;

    public Zi() {
        super(10,"asd");
        System.out.println("zi无参构造方法被调用");
    }

    public Zi(int age) {
        super(10,"asd");
        this.age = age;
        System.out.println("zi带参构造方法被调用");
    }
}
