package two_stage.day05.List07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");

        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s);
        }
        for (String s :arr){
            System.out.println(s);
        }

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s :linkedList){
            System.out.println(s);
        }
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));

        }
        Iterator<String> ite = linkedList.iterator();
        while (ite.hasNext()){
            String s = (String) ite.next();
            System.out.println(s);
        }


    }
}
