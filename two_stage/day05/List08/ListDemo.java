package two_stage.day05.List08;

import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addFirst("hello");
        linkedList.addFirst("world");
        linkedList.addFirst("java");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
    }
}
