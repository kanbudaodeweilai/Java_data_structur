package one_stage.day09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student01 = new Student();
        Student student02 = new Student();
        Student student03 = new Student();
        students.add(student01);
        students.add(student02);
        students.add(student03);

        Scanner sc = new Scanner(System.in);
        for (int i =0;i<students.size();i++){
            Student student1 = new Student();
            System.out.printf("请输入第%d个同学的年龄：",i+1);
            String age = sc.nextLine();
            student1.setAge(Integer.parseInt(age));
            System.out.printf("请输入第%d个同学的名字:",i+1);
            String name = sc.nextLine();
            student1.setName(name);
            students.set(i,student1);
        }


        for (int i =0;i<students.size();i++){
            System.out.printf("第%d个同学的名字是%s,年龄是%d",i+1,students.get(i).getName(),students.get(i).getAge());
            System.out.println();
        }
    }
}
