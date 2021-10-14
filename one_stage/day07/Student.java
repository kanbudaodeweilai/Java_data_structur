package one_stage.day07;
/**
 * 带参数构造和get和set方法可以有家generate直接生成
 * 也可以ctrl+inset 直接生成
 *
 *
 * */
public class Student {
    private String name ;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
