package two_stage.day01.ExtendsTest02;

public class Zi extends FU{
    int age = 20;

    public void ziShow(){
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
