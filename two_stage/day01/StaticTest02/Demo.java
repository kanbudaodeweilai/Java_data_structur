package two_stage.day01.StaticTest02;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(10,"zhangtianxiang","95356");
        Student student2 = new Student();
        student2.age=12;
        student2.name="oiopsad";

        System.out.println(student2.address);
    }
}
