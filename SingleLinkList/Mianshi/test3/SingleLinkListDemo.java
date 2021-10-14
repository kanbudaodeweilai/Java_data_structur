package Java_data_structur.SingleLinkList.Mianshi.test3;

public class SingleLinkListDemo {
    public static void main(String[] args) {
        SingleLinkList linkList = new SingleLinkList();
        HeroNode a = new HeroNode(1,"zhang","xiaojiajia");
        HeroNode b = new HeroNode(2,"1","2");
        HeroNode c = new HeroNode(3,"3","4");
        HeroNode d = new HeroNode(4,"5","6");
        HeroNode e = new HeroNode(4,"5","6");
        linkList.addFirst(a);
        linkList.addFirst(c);
        linkList.addFirst(d);
        linkList.addFirst(b);
        linkList.addFirst(e);

//        无限添加是因为地址相同
//        linkList.addFirst(e);



//        System.out.println(linkList.findLastK(2));


        linkList.show();
        linkList.reverse();
        linkList.show();


    }
}
