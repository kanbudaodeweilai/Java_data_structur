package Java_data_structur.SingleLinkList;

public class SingleLinkListDemo {
    public static void main(String[] args) {
        SingleLinkList linkList = new SingleLinkList();
        HeroNode a = new HeroNode(1,"zhang","xiaojiajia");
        HeroNode b = new HeroNode(2,"1","2");
        HeroNode c = new HeroNode(3,"3","4");
        HeroNode d = new HeroNode(4,"5","6");
        linkList.add(a);
        linkList.add(c);
        linkList.add(d);
        linkList.add(b);

        linkList.change("1","zhuyingtai");
        linkList.showreverse();
//        linkList.show();


    }
}
