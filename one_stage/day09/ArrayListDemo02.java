package one_stage.day09;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("123");
        array.add("345");
        array.add("567");
        for (int i =0;i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
}
