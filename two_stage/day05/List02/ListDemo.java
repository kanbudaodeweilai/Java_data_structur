package two_stage.day05.List02;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("java");
        list.set(2,"jiajia");
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
