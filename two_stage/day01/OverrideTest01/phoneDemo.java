package two_stage.day01.OverrideTest01;

public class phoneDemo {
    public static void main(String[] args) {
        phone p = new phone();
        p.call("jiajia");
        iphone ip = new iphone();
        ip.call("佳佳");
    }
}
