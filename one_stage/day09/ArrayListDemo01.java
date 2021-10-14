package one_stage.day09;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        array.add("asdw");
        array.add("zxnmzx");
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.get(1));
        System.out.println(array.get(1).getClass().toString());
        System.out.println(array.remove(1));
        System.out.println(array);
        array.add("asdiquowe");
        array.set(1,"1231231");
        System.out.println(array);


    }
}
