package two_stage.day02.Abstract03;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void paly(){
        System.out.println("猫玩");
    }
}
