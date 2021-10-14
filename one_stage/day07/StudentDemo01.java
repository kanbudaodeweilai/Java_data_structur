package one_stage.day07;

public class StudentDemo01 {
    public static void main(String[] args) {
        Student stu1 = new Student("xiaoming",18);
        Student stu2 = new Student();
        int stu1name = stu1.getAge();
        System.out.println(stu1name);
        stu2.setAge(19);
        stu2.setName("zhang");
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());
    }





}