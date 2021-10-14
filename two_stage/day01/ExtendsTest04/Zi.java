package two_stage.day01.ExtendsTest04;

public class Zi extends Fu{
    public void method(){
        System.out.println("zi的方法被调用");

    }
    @Override
    public void show(){
        System.out.println("zi中的show被调用");
        super.show();

    }
}
