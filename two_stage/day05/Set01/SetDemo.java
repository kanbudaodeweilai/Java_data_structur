package two_stage.day05.Set01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");//有重复就直接去除，不会报错
        System.out.println(set);
        System.out.println(set.hashCode());

    }
}
