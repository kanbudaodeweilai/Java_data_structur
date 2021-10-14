package one_stage.day08;

public class StringTest05 {
    public static String reverse(String a){
        String b = "";
        for (int i = a.length()-1;i>=0;i--){
            b = b + a.charAt(i);
        }
        return b;
    }

    public static void main(String[] args) {

        String a = "123456";
        String b = reverse(a);
        System.out.println(b);
    }
}
