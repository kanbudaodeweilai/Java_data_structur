package two_stage.day05.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
        Iterator<String> it = c.iterator();
//        public Iterator<E> iterator() {
//            return new ArrayList.Itr();
//        }
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
