package two_stage.day05.List04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("java");
        Iterator<String> it = list.iterator();
//        会出现并发修改异常
//        while (it.hasNext()){
//            String s = it.next();
//            if (s.equals("world")) {
//                list.add("javaee");
//            }


//            }
        System.out.println(list);

        for(int i =0;i<list.size();i++){
            if (list.get(i).equals("java")) {
                list.add("asdasdadas");
            }
            System.out.println(list.get(i));
            }


        }


}

