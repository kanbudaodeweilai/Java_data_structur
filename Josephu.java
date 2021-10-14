package Java_data_structur.CriclLinkList;


public class Josephu {
    JNode frist = new JNode(1);

    public void creat(int num){
        JNode last = frist;

        for (int i =2;i<=num;i++){
            JNode Boy = new JNode(i);
            last.next=Boy;
            last=Boy;
//            System.out.println(i+"添加成功");
        }
        last.next=frist;
    }


    public void show(){
        JNode temp = new JNode();
        System.out.println(frist.toString());
        temp=frist.next;
        while (temp!=frist){

            System.out.println(temp.toString());
            temp=temp.next;
        }

    }
    public void out(int n,int k,int m){
        JNode last =frist;
        while (last.next!=frist){
            last=last.next;
        }
        for (int i=0;i<k-1;i++){
            frist= frist.next;
            last = last.next;
        }
        while (frist.next!=last){
            for (int i=0;i<m-1;i++){
                frist = frist.next;
                last = last.next;
            }
            System.out.println(frist.toString());
            frist= frist.next;
            last.next=frist;
        }
        for (int i=0;i<m-1;i++){
            frist = frist.next;
            last = last.next;
        }
        System.out.println(frist.toString());
        System.out.println(last.toString());



    }

}
