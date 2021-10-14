package two_stage.day02.Polymorphism02;

public class Cat extends Animal {
    public int age = 20;
    public int weight = 10;
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉老鼠");
    }

}
