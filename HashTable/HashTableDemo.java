package Java_data_structur.HashTable;

import java.util.Scanner;

//链地址方法

public class HashTableDemo {
    public static void main(String[] args) {
        hashTable hashTable = new hashTable(7);
        Emp emp1 = new Emp(2,"zhang");
        Emp emp2 = new Emp(4,"zhang");
        Emp emp3 = new Emp(6,"zhang");
        Emp emp4 = new Emp(8,"zhang");
        Emp emp5 = new Emp(9,"zhang");
        Emp emp6 = new Emp(45,"zhang");
        Emp emp7 = new Emp(23,"zhang");
        Emp emp8 = new Emp(1,"zhang");
        hashTable.add(emp1);
        hashTable.add(emp2);
        hashTable.add(emp3);
        hashTable.add(emp4);
        hashTable.add(emp5);
        hashTable.add(emp6);
        hashTable.add(emp7);
        hashTable.add(emp8);


        hashTable.list();

    }
}
class hashTable{
    private EmpLinkedList[] empLinkedListsArr ;
    private int size;
    public void add(Emp emp){
        int h = H(emp.id);
        empLinkedListsArr[h].add(emp);
    }
    public int H(int id){
        return id%size-1;

    }

    public hashTable(int size) {
        this.size = size;
        this.empLinkedListsArr = new EmpLinkedList[size];
        for (int i =0;i<size;i++){
            empLinkedListsArr[i] = new EmpLinkedList();
        }
    }
    public void list(){
        for (int i=0;i<size;i++){
            Emp temp = empLinkedListsArr[i].head;
            System.out.print(i+"::");
            while (temp!=null){
                System.out.print(temp.id+"  ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}

class Emp{
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class EmpLinkedList{
    Emp head = null;
    Emp temp;
    public void add(Emp emp){
        if(head==null){
            head = emp;
        }else {
            temp=head;
            while (temp.id>emp.id&&temp.next!=null){
                temp=temp.next;
            }
            if (temp.next==null){
                temp.next=emp;
            }else {
                emp=temp.next;
                temp.next=emp;
            }
        }
    }
    public void del(int empid){
        if (head.next==null){
            System.out.println("为空，无法删除");
        }else {
            while (head.next.id!=empid){
                head=head.next;
            }
            head.next=head.next.next;
        }
    }
    public void change(int empid){
        if (head.next==null){
            System.out.println("为空，无法修改");
        }else {
            while (head.next.id !=empid){
                head=head.next;
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名：");
            head.next.name=sc.nextLine();
            System.out.println("修改成功");
        }

    }
    public boolean find(int empid){
        if (head.next==null){
            System.out.println("为空");
            return false;
        }else {
        while (head.next.id!=empid){
            head=head.next;
        }
        return true;
        }
    }
}