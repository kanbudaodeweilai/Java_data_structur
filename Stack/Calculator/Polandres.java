package Java_data_structur.Stack.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Polandres {
    public static void main(String[] args) {

        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();

        //16  1 2 3 + 4 * + 5 -
        String expersion = "1 + ( ( 2 + 3 ) * 4 ) - 5";
        String[] split = expersion.split(" ");
        List<String> list = new ArrayList<String>();
        for (String s:split){
            list.add(s);
        }
        for (String item:list){
            if (item.matches("\\d+")){
                stack1.push(item);
            }else if (item.equals("/")||item.equals("*")||item.equals("-")||item.equals("+")){
                if (stack2.isEmpty()){
                    stack2.push(item);
                }else if(stack2.peek().equals("(")){
                    stack2.push(item);

                } else if(priority(item)>priority(stack2.peek())){
                    stack2.push(item);
                }else {
                    stack1.push(stack2.pop());
                    stack2.push(item);
                }

            }else if (item.equals(")")){
                while (stack2.peek()!="("){
                    stack1.push(stack2.pop());
                    break;
                }
                stack2.pop();
            }else if(item.equals("(")){
                stack2.push(item);
            }
        }
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }

    }
    public static int priority(String oper){
        if (oper.equals("(")){
            return 2;
        }else if (oper.equals("*")||oper.equals("/")){
            return 1;
        }else {
            return 0;
        }


    }
    public static boolean isOper(String oper){
        if (oper=="/"||oper=="+"||oper=="-"||oper=="*"){
            return true;
        }else {
            return false;
        }
    }
}
