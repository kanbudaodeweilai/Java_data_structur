package two_stage.day03.Parameter_passing03;

public class Cat extends Animal implements Jump {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
    }

    @Override
    public void jump() {
        System.out.println("猫跳");


    }

}
