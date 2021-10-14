package one_stage.day05;

public class Demo01 {
    public static void main(String[] args) {
        isEvenNumber(21);
    }
    public static void isEvenNumber(int num){
        int num1 = num;
        if(num1 % 2 == 0 ){
            System.out.println("true");

        }else {
            System.out.println("fasle");
        }
    }
}

