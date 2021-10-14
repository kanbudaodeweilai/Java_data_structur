package two_stage.day02.Abstract01;
//  抽象类
public abstract class Animal {
//  抽象方法
    public abstract void eat();
//  抽象类中可以有非抽象方法
    public void sleep(){
        System.out.println("睡觉");
    }
}
