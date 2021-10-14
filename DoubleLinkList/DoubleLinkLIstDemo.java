package Java_data_structur.DoubleLinkList;

public class DoubleLinkLIstDemo {
    public static void main(String[] args) {
        DLNode h1= new DLNode(1,"zhang","wudi");
        DLNode h2= new DLNode(2,"tian","1");
        DLNode h3= new DLNode(3,"xiang","2");
        DLNode h4= new DLNode(4,"li","3");
        DLNode h5= new DLNode(5,"jia","4");

        DoubleLinkList linkList = new DoubleLinkList();
        linkList.addUp(h3);
        linkList.addUp(h2);
        linkList.addUp(h1);
        linkList.addUp(h5);
        linkList.addUp(h4);

        linkList.showf();
        linkList.showl();




    }
}
