package one_stage.day08;

public class StringDemo02 {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);//s3和s4的的定义方式，只要字符串相同那么地址就相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
