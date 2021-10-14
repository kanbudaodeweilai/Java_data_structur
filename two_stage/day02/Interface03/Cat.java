package two_stage.day02.Interface03;

public class Cat extends Animal implements Jump {
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }


    @Override
    public void jump() {
        System.out.println("猫跳高");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void play(){
        System.out.println("猫玩");
    }
}
