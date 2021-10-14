package two_stage.day02.Polymorphism05;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
