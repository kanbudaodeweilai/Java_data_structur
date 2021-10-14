package one_stage.day09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest02 {
    public static void main(String[] args) {
        int temp=0;
        ArrayList<Student> students = new ArrayList<>();
        while (true){
            System.out.println("请输入你要进行的操作：1.增加学生" +
                    "2.修改学生信息" +
                    "3.删除学生信息" +
                    "4.查看学生信息" +
                    "5.退出系统");
            Scanner sc = new Scanner(System.in);
            temp = sc.nextInt();
            if (temp==5){break;}
            switch (temp){
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    changeStudent(students);
                    break;
                case 3:

                    delStudent(students);
                    break;
                case 4:
                    serchStudent(students);
                    break;
                default:    break;
            }

        }


    }
    public static void addStudent(ArrayList<Student> students){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        student.setName(name);
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("请输入学生地址：");
        String address = sc.next();
        student.setAddress(address);
        students.add(student);

    }
    public static void delStudent(ArrayList<Student> students){
        System.out.println("请输入需要删除的学生的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = 0;
        for (int i =0;i<students.size();i++){
            if (name.equals(students.get(i).getName())){
                students.remove(i);
                System.out.println("删除成功");
                a= a+1;
                break;
            }


        }
        if (a==0){
            System.out.println("没有这个人，请从新输入");
        }

    }
    public static void changeStudent(ArrayList<Student> students){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的序号：");
        int index = sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        student.setName(name);
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("请输入学生地址：");
        String address = sc.next();
        student.setAddress(address);
        students.set(index,student);


    }

    public static void serchStudent(ArrayList<Student> students){
        System.out.println("请输入要查看学生的序号：");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(students.get(index).getName());
        System.out.println(students.get(index).getAge());
        System.out.println(students.get(index).getAddress());

    }

}
