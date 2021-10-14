package Java_data_structur.Stack.BaseStack;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack();
        as.creatStack(5);
        as.push(5);
        as.push(5);
        as.push(5);
        as.push(5);
        as.push(5);
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
//        System.out.println(as.pop());


    }
}
