package Java_data_structur.Stack.BaseStack;

public class ArrayStack {
    int top = -1;
    int[] stack;
    int maxSize;
    public void creatStack(int num){
        maxSize = num;
        stack = new int[maxSize];
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
        if (top==maxSize-1){
            return true;
        }else {
            return false;
        }
    }
    public void push(int n){
        if (isFull()){
            throw new RuntimeException("栈满，无法加入");
        }else {
            top++;
            stack[top]=n;
            System.out.println("添加成功");
        }

    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空，无法出");
        }else {
            return stack[top--];
        }
    }
}
