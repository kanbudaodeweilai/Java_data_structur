package two_stage.day01.OverrideTest03;

public class Demo {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.age = 10;
        stu.name = "zhangtianxiang";
        stu.study();
        Teacher tea = new Teacher();
        tea.age = 20;
        tea.name= "lijia";
        tea.teach();
    }

}
