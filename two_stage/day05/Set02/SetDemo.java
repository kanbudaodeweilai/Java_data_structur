package two_stage.day05.Set02;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        for (String s:set){
            System.out.println(s);
        }
    }
}
