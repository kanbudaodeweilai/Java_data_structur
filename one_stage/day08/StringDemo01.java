package one_stage.day08;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println("s1:"+s1);
        s1 = s1+"asdasd";
        System.out.println(s1);
        char[] chs ={'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);
        int num = 453452410;
        String s3 = new String(String.valueOf(num));
        System.out.println(s3);
    }
}
