package two_stage.day02.Polymorphism03;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉老鼠");
    }

}
