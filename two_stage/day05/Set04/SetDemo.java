package two_stage.day05.Set04;

import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("jiajia",25);
        Student s2 = new Student("tiantian",22);
        Student s3 = new Student("xiaojiajia",23);
        Student s4 = new Student("xiaotiantian",24);
        Student s5 = new Student("asdasd",23);
        Student s6 = new Student("asdasd",23);

        TreeSet<Student> ts = new TreeSet<Student>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s :ts){
            System.out.println(s.getName()+s.getAge());
        }


    }
}
