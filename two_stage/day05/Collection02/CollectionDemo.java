package two_stage.day05.Collection02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("abd",10);
        Student s2 = new Student("pkas",20);

        c.add(s1);
        c.add(s2);

        System.out.println(c);
        Iterator<Student> iterator = c.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.getAge()+" "+s.getName());
        }

    }
}
