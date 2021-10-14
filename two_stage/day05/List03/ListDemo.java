package two_stage.day05.List03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("asdsd",20);
        Student s2 = new Student("abd",10);
        Student s3 = new Student("pkas",20);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.getAge()+s.getName());
        }

    }
}
