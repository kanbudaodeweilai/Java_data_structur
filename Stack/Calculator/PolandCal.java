package Java_data_structur.Stack.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandCal  {
    public static void main(String[] args) {
        //76
        String suffixExpression = "4 5 * 8 - 60 + 8 2 / +";
        List<String> list = new ArrayList<>();
        String[] split = suffixExpression.split(" ");
        for (String ele:split){
            list.add(ele);
        }
        Stack<String> stack = new Stack<String>();
        for (String item:list){
            if (item.matches("\\d+")){
                //匹配的是多位数
                stack.push(item);
            }else{
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int sum=0 ;
                if (item.equals("+")){
                    sum = num1+num2;
                }else if(item.equals("-")){
                    sum = num1-num2;
                }else if(item.equals("*")){
                    sum = num1*num2;
                }else if(item.equals("/")){
                    sum = num1/num2;
                }
                stack.push(sum+"");
            }

        }
        System.out.println(stack.pop());


    }
}
