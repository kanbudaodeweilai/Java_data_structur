package two_stage.day05.Set06;

import java.util.Comparator;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int s1count = s1.getChinese()+s1.getMath();
                int s2count = s2.getChinese()+s2.getMath();
                int num = s1count-s2count;
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        Student s1 = new Student("jiajia",85,98);
        Student s2 = new Student("xiaojiajia",82,90);
        Student s3 = new Student("tiantian",85,69);
        Student s4 = new Student("xiaotiantian",35,98);
        Student s5 = new Student("jiajiazi",75,88);
        Student s6 = new Student("dongxiaohu",8,18);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s:ts){
            System.out.println(s.getName());
        }
    }
}
