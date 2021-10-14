package Java_data_structur.DoubleLinkList;

public class DoubleLinkList {
    DLNode head = new DLNode();
    public boolean isEmpty(){
        if (head.next==null){
            return true;
        }else {
            return false;
        }
    }
    public void addFrist(DLNode node){
        node.next = head.next;
        node.pre = head;
        head.next = node;
        node.pre.next=node;
//        System.out.println("添加成功");

    }
    public void addLast(DLNode node){
        DLNode temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        node.pre = temp;
        temp.next=node;
    }
    public void addUp(DLNode node){
        DLNode temp = head;
        if (isEmpty()){
            addFrist(node);
        }else {
            while (temp.next!=null&&temp.next.num<node.num){
                temp=temp.next;
            }
            if (temp.next!=null){
                node.pre=temp;
                node.next=temp.next;
                temp.next=node;
                node.next.pre=node;


            }else {
                temp.next=node;
                node.pre=temp;
            }

        }
    }
    public void change(int num,String name){
        if (isEmpty()){
            throw new RuntimeException("链表为空，无法修改") ;
        }else {
            DLNode temp = head.next;
            while (temp!=null){
                if (temp.num==num){
                    temp.name=name;
                    break;
                }else {
                    temp=temp.next;
                }
                if (temp==null){
                    System.out.println("没有这个编号！");

                }
            }
        }
    }
    public void showf(){
        if (isEmpty()){
            System.out.println("链表为空");
        }else {
            DLNode temp =head.next;
            while (temp!=null){
                System.out.println(temp.toString());;
                temp=temp.next;
            }
        }

    }
    public void showl(){
        if (isEmpty()){
            System.out.println("链表为空");
        }else {
            DLNode temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            while (temp!=head){
                System.out.println(temp.toString());
                temp=temp.pre;
            }

        }
    }
}
