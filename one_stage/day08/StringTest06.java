package one_stage.day08;

public class StringTest06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = "asdasw2easd";
        sb.append(a);
        System.out.println(sb);
        sb.append("a0000000");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.getClass().toString());
        String c = sb.toString();
        System.out.println(c.getClass().toString());
    }
}
