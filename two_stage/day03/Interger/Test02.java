package two_stage.day03.Interger;

public class Test02 {
    public static void main(String[] args) {
        int number = 100;
        String s= number+"";
        System.out.println(s);
        System.out.println(s.getClass().toString());
        String s2 = String.valueOf(number);
        System.out.println(s2);


        String str = "123456";
        Integer i = Integer.valueOf(str);
        System.out.println(i);
        System.out.println(i.getClass().toString());

        Integer i2 = Integer.valueOf(str);
        System.out.println(i2);
        System.out.println(i2.getClass().toString());
    }
}
