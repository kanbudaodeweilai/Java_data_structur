package Java_data_structur.DoubleLinkList;

public class DLNode {
    int num;
    String name;
    String nickname;
    DLNode pre=null;
    DLNode next=null;

    public DLNode() {
    }

    public DLNode(int num, String name, String nickname) {
        this.num = num;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "DLNode{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

}
