package Java_data_structur.CriclLinkList;

public class JNode {
    int num;
    JNode next;

    public JNode(int num) {
        this.num = num;

    }

    public JNode() {
    }

    @Override
    public String toString() {
        return "JNode{" +
                "num=" + num +
                '}';
    }
}
