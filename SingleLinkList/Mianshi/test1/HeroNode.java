package Java_data_structur.SingleLinkList.Mianshi.test1;

public class HeroNode {
    int num;
    String name;
    String nickname;
    HeroNode next=null;

    public HeroNode() {
    }

    public HeroNode(int num,String name, String nickname) {
        this.num = num;
        this.name = name;
        this.nickname = nickname;

    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
