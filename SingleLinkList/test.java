package Java_data_structur.SingleLinkList;

public class test {
    public static void main(String[] args) {
        HeroNode a = new HeroNode();
        a.name="zhang";
        a.nickname = "jiajia";
        a.next = null;

        HeroNode b = new HeroNode();
        b=a;
        b.name="asdasda";
        System.out.println(a.name);

    }
}
