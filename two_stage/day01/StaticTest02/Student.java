package two_stage.day01.StaticTest02;

public class Student {
    public int age ;
    public String name;
    public static String address;//共享

    public Student() {
    }

    public Student(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
}
