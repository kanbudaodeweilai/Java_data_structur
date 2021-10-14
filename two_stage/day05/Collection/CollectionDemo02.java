package two_stage.day05.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
//        System.out.println(c.add("hello"));//c.add()只会返回ture
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c.contains("java"));
//        c.clear();
        System.out.println(c);
    }

}
