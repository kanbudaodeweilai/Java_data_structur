package two_stage.day05.List06;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i:arr){
            System.out.println(i);

        }
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s:list){
            System.out.println(s);
        }//原理是迭代器



//        抛出异常
//        for (String s: list){
//            if (s.equals("world")){
//                list.add("asdasd");
//            }
//        }
//        Exception in thread "main" java.util.ConcurrentModificationException
//        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
//        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
//        at two_stage.day05.List06.ListDemo.main(ListDemo.java:23)

    }
}
