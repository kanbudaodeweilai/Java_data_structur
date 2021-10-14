package Java_data_structur.Stack.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        ArrayStack numStack = new ArrayStack();
        ArrayStack operStack = new ArrayStack();
        numStack.creatStack(100);
        operStack.creatStack(100);
        String s = "1*2+4/2+8*4/2";
        int index=0;
        char ch;
        while (index<s.length()){
            ch = s.charAt(index);

            if (operStack.isOper(ch)){
                if (operStack.isEmpty()){
                    operStack.push(ch);
                }else {
                    if (operStack.priority(ch)> operStack.priority((char)operStack.getTop())){
                        operStack.push(ch);
                    }else {
                        int a =numStack.pop();
                        int b = numStack.pop();
                        int oper = operStack.pop();
                        int c = numStack.calculate(b,a,oper);
                        numStack.push(c);
                        operStack.push(ch);
                    }
                }
            }else {
                int num =ch - '0';
                numStack.push(num);
            }
            index++;

        }
        while (!operStack.isEmpty()){
            int a =numStack.pop();
            int b = numStack.pop();
            int oper = operStack.pop();
            int c = numStack.calculate(b,a,oper);
            numStack.push(c);
        }
        System.out.println(numStack.getTop());


    }
}
