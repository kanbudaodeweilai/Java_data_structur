package Java_data_structur.SingleLinkList.Mianshi.test2;

public class SingleLinkList {
    HeroNode head = new HeroNode();

    public boolean isEmpty(){
        if (head.next==null){
            return true;
        }else {
            return false;
        }
    }
    public void addFirst(HeroNode Node){
        if (isEmpty()){
            head.next=Node;
        }else {
            Node.next = head.next;
            head.next = Node;
        }
    }
    public void addLast(HeroNode Node){
        HeroNode temp = new HeroNode();
        temp = head.next;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=Node;
        Node.next=null;
    }
    public void delete(String name){
        if (isEmpty()){
            throw new RuntimeException("链表为空，无法删除");
        }else {
            HeroNode temp = new HeroNode();
            temp = head;
            while (temp.next.name!=name){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

    }
    public void change(String oname,String nname){
        if (isEmpty()){
            throw new RuntimeException("链表为空无法修改");
        }else {
            HeroNode temp = new HeroNode();
            temp=head.next;
            while (temp!=null&&temp.name!=oname){
                temp=temp.next;

            }

            if (temp==null){
                throw new RuntimeException("链表中没有这个好汉");
            }
            temp.name=nname;
        }

    }
    public void add(HeroNode Node){
        HeroNode temp = new HeroNode();
        if (isEmpty()){
            head.next=Node;
        }else {
            temp=head;
            while (temp.next!=null&&temp.next.num< Node.num){
                temp=temp.next;

            }
            Node.next=temp.next;
            temp.next=Node;
        }


    }


    public void show(){
        if (isEmpty()){
            System.out.println("链表为空");
        }else {
            HeroNode temp = new HeroNode();
            temp = head.next;
            while (temp.next!=null){
                System.out.println(temp.toString());
                temp=temp.next;
            }
            System.out.println(temp.toString());
        }
    }
    public HeroNode findLastK(int k){
        HeroNode temp1 = head;
        HeroNode temp2 = head;
        for (int i=0;i<k;i++){
            temp1=temp1.next;

        }
        if (temp1==null){
            throw new RuntimeException("链表长度不足5");
        }else {
            while (temp1!=null){
            temp1=temp1.next;
            temp2=temp2.next;
            }
            return temp2;
        }

    }

}
